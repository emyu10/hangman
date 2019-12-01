package Hangman;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button() {
        Font bfont = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        setFont(bfont);
        Color bgColor = new Color(248, 58, 34);
        Color fgColor = new Color(254, 230, 227);
        setBorder(BorderFactory.createLineBorder(fgColor));
        setForeground(fgColor);
        setBackground(bgColor);
    }
}
