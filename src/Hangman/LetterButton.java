package Hangman;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetterButton extends BaseButton {

    LetterButton(String letter, AppWindow parent) {
        super(letter, parent);
        ActionListener playListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.play(e.getActionCommand().charAt(0));
            }
        };
        addActionListener(playListener);
        setForeground(Color.WHITE);
        if (((int) letter.charAt(0)) % 2 == 0) {
            setBackground(Color.GRAY);
        } else {
            setBackground(Color.DARK_GRAY);
        }
    }
}