package Hangman;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class AppWindow extends JFrame{
	ButtonGrid buttons;
	Display display;
	ManDrawer man;
	private ArrayList<Game> finishedGames = new ArrayList<>();
	private Game currentGame;
	AppWindow(){
		//getContentPane().setBackground(Color.GRAY);
		setIconImage ((new ImageIcon("Logo.png")).getImage());
		buttons = new ButtonGrid(this);
		setLayout(null);
		buttons.setBounds(5,50,270,450);
		add(buttons);

		display = new Display(this);
		display.setBounds(290,50,270,250);
		add(display);
		
		man = new ManDrawer(this);
		man.setBounds(350,300,500,250);
		add(man);
		
		newGame();
		getContentPane().setBackground(Color.DARK_GRAY);
		//System.out.print(currentGame.getMasked());
		setTitle("Hangman");
		setResizable(false);
		setSize(600,600);
		setVisible(true);
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public ManDrawer getMan() {
		return man;
	}
	public void newGame() {
		
		if (currentGame != null) {
			if (currentGame.isGameOver()) {
				finishedGames.add(currentGame);
				
			}
			man.reset();
		}
		currentGame = new Game(this);
		display.setText(currentGame.getMasked());
	}
	public void play(char c) {
		boolean correct = currentGame.play(c);
		
		if (correct) {
			display.setText(currentGame.getMasked());
		}else {
			man.drawNext();
		}
		if (currentGame.isGameOver()) {
			String message = "Game is over. ";
			if (currentGame.isWon()) {
				message += "YOU WON";
			} else {
				message += "You Lost";
			}
			JOptionPane.showMessageDialog(this,  message);
		}
	}
}
