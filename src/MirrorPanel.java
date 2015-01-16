import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

public class MirrorPanel extends JPanel {
	
	private double angle = 0;
	private int yC = 0;
	private double refAngle = 0;
	private int space = 0;
	private boolean ball = false;
	
	public MirrorPanel(double ang){
		angle = ang;
	}
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		
		//mirror
		g2.setColor(new Color(52, 73, 94));
		g2.fillRect(400, 0, 100, 750);
		
		//baseline
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		//g2.drawLine(0, 500, 400, 500);
		
		updateLine(g);
		drawReflection(g);
		
	}
	
	public void setAngle(double yPos){
		if(yPos < yC){
			angle += 5;
		} else if(yPos > yC){
			angle -= 5;
		}
		//System.out.println("Angle: " + angle);
		repaint();
	}
	
	
	public void updateLine(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		//draw the line
		g2.setColor(new Color(231, 76, 60));
		int yPos = (int)(.3*(Math.tan(Math.toRadians(angle)) * 400));
		//System.out.println(yPos);
		final float dash1[] = {10.0f};
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(0, 500, 400, 500 - yPos);
		g2.setColor(Color.BLACK);
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
		g2.setStroke(dashed);
		g2.drawLine(0, 500 - yPos, 400, 500 - yPos);
		space = (500 - 2*yPos);
		yC = 500 - yPos;
	}
	
	public void drawReflection(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		double alpha = 90 / (90 - angle);
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(0, space, 400, yC);
		g2.setColor(Color.RED);
		g2.drawString("Angle: " + angle, 20, 600);
	}	
}
