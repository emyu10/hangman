package Hangman;

<<<<<<< HEAD
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
=======
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

>>>>>>> ffe9a26... some refactoring
    }
}
