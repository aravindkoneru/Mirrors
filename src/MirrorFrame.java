import javax.swing.JFrame;

public class MirrorFrame extends JFrame {
	
	public MirrorFrame(){
		MirrorPanel panel = new MirrorPanel(30);
		getContentPane().add(panel);
		pack();
	}

}
