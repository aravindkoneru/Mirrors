import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MirrorPanel extends JPanel {
	
	private double angle = 0;
	
	public MirrorPanel(double ang){
		angle = ang;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		//mirror
		g2.setColor(Color.GRAY);
		g2.fillRect(400, 0, 100, 750);
		
		//baseline
		g2.setColor(Color.red);
		g2.drawLine(0, 500, 400, 500);
		
		updateLine(g);
		
	}
	
	public void setAngle(double ang){
		angle = ang;
	}
	
	public void updateLine(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		//draw the line
		int yPos = (int)(Math.tan(Math.toRadians(angle)) * 400);
		System.out.println(yPos);
		g2.drawLine(0, 500, 400, yPos);
		
	}
	
	
	
}
