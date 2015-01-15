import javax.swing.JFrame;

public class MirrorTester {
	public static void main(String[] args) {
		final int WIDTH = 500;
		final int HEIGHT = 750;
		JFrame appFrame = new MirrorFrame();
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.setResizable(false);
		appFrame.setSize(WIDTH, HEIGHT);
		appFrame.show();
		//YellowFrame test = new YellowFrame();
		//test.carTester();s
		
	}
}