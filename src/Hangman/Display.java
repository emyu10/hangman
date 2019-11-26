package Hangman;
import java.awt.Font;

import javax.swing.JTextField;

public class Display extends JTextField {
	HFrame parent;
	Display (HFrame p){
		parent = p;
		Font Dfont = new Font("sans-serif", Font.BOLD, 20);
		setHorizontalAlignment(JTextField.CENTER);
		setEditable(false);
		setText("TEST");
		setFont(Dfont);
		setEditable(false);
	}
	public void setText (String t) {
		String newT = "";
		for (int i = 0; i < t.length(); i++) {
			newT += String.valueOf(t.charAt(i))+" ";
			super.setText(newT);
		}
	}
}
