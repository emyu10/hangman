package Hangman;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class HButtons extends JPanel{
	HFrame parent;
	HButtons(HFrame p){
		parent = p;
		LetterButton[] letterButtons = new LetterButton[26];
		for (int i = 0; i < letterButtons.length; i++) {
			letterButtons[i] = new LetterButton(parent, String.valueOf((char) (i + 65)));
			add(letterButtons[i]);
		}


		
		Button newGame = new Button();
		newGame.setText("NEW");

		newGame.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				parent.newGame();
			}
		});
		
		setLayout(new GridLayout(9,3));
		add(newGame);//every new word will be displayed by clicking this button
	}
}
