import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;

public class MirrorFrame extends JFrame {
	
	MirrorPanel panel = new MirrorPanel(30);
	
	public MirrorFrame(){
		setListener();
		getContentPane().add(panel);
		pack();
	}
	
class mouseListener extends MouseInputAdapter {
		
		public void mouseDragged(MouseEvent e){
			int xPos = e.getX();
			int yPos = e.getY();
		//	System.out.println(xPos + " " + yPos);
			panel.setAngle(yPos);
		}
		
		public void mousePressed(MouseEvent e){
			//System.out.println("pressed");
			mouseDragged(e);
			
		}
	}
	
	public void setListener(){
		mouseListener listen = new mouseListener();
		panel.addMouseListener(listen);
		
	}

}
