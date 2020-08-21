package Hangman;

import javax.swing.*;
import java.awt.*;

public class BaseButton extends JButton {
    protected String letter;
    protected AppWindow parent;

    BaseButton(String letter, AppWindow parent) {
        this.letter = letter;
        this.parent = parent;
        setupSelf();
    }

    protected void setupSelf() {
        Font buttonFont = new Font("sans-serif", Font.BOLD, 15);
        setText(this.letter);
        setFont(buttonFont);

        setBackground(Color.GREEN);
    }
}
