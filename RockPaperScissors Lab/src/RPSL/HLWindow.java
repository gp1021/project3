package RPSL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HLWindow {
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg); //shows a jpane message to the user and asks for input
	}
	
	public void println(String msg) {
		System.out.println(msg); //prints out a message
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s); //shows a jpane message
		
	}

}
