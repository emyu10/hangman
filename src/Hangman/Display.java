package Hangman;
import java.awt.*;

import javax.swing.*;

public class Display extends JTextField {
	HFrame parent;
	Display (HFrame p){
		parent = p;
		Font Dfont = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		setHorizontalAlignment(JTextField.CENTER);
		setEditable(false);
		setText("TEST");
		setFont(Dfont);
		setEditable(false);
		setBackground(Color.DARK_GRAY);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createEmptyBorder());
	}
	public void setText (String t) {
		String newT = "";
		for (int i = 0; i < t.length(); i++) {
			newT += String.valueOf(t.charAt(i))+" ";
			super.setText(newT);
		}
	}
}
