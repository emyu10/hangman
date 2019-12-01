package Hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetterButton extends Button implements ActionListener {
    private HFrame parent;

    public LetterButton(HFrame parent, String text) {
        super();
        setText(text);
        this.parent = parent;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.play(e.getActionCommand().charAt(0));
    }
}
