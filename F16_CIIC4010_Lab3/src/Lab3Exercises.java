import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("By: Tek-Wiz");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(450, 200);
		myFrame.setSize(400, 400);
		
		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
}