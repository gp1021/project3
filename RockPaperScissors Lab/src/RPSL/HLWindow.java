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
	
	//used to to ask and replay the game
	public int option(String[] replay, String string) {
		return JOptionPane.showOptionDialog(null, string, "Replay", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, replay, replay[0]);
	}

}
