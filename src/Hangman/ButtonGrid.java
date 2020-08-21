package Hangman;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class ButtonGrid extends JPanel{
	AppWindow parent;
	ButtonGrid(AppWindow p){
		parent = p;
		setLayout(new GridLayout(9,3));

		ArrayList<BaseButton> buttons = new ArrayList<>();

		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			buttons.add(new LetterButton(String.valueOf((char) i), parent));
		}

		BaseButton newButton = new BaseButton("NEW", parent);
		newButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				parent.newGame();
			}
		});

		buttons.add(newButton);

		for(BaseButton b : buttons) {
			add(b);
		}
	}
}
