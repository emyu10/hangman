package Hangman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Game {
	AppWindow parent;
	private String word;
	private String masked ="";
	private int wrongTries = 0;
	
	private boolean gameOver = false;
	private boolean won = false;
	private static int TOTAL = 0;
	private static int WON = 0;
	private static int LOST = 0;
	public static final int MAX_WRONG_TRIES = 6;
	public Game(AppWindow p) {
		parent = p;
		try {
			setWord();
			maskWord();
		}catch (Exception e) {
			e.printStackTrace();
		}
		TOTAL++;
	}
	
	private void setWord() throws FileNotFoundException, IOException{
		FileInputStream in = new FileInputStream ("words.txt");
		Scanner s = new Scanner(in);
		int count = 0;
		while (s.hasNextLine()) {
			s.nextLine();
			count++;
		}
		
		
		in = new FileInputStream("words.txt");
		s = new Scanner(in);
		
		int random =(int) (Math.random() * count);
		int i = 0;
		
		while (s.hasNextLine()) {
			word = s.nextLine().toUpperCase();
			if (i == random) {
				break;
			}
			i++;
		}
		s.close();
		in.close();
		
	}

	
	private void maskWord() {
		int firstChar = (int) (Math.random() * word.length());
		int secondChar = (int) (Math.random() * word.length());
		
		for (int i = 0; i < word.length(); i++) {
			if (i == firstChar || i == secondChar) {
				masked += String.valueOf(word.charAt(i));
			} else {
				masked += "_";
			}
		}
	}
	
	public String getMasked() {
		return masked;
	}
	
	public boolean play(char c) {
		boolean correct = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				correct = true;
				updateMask(i,c);
			}
		}
		if (!correct) {
			wrongTries++;
		}
		if(word.contentEquals(masked)) {
			won = true;
			gameOver = true;
			WON++;
		}
		if (wrongTries == MAX_WRONG_TRIES) {
			gameOver = true;
			won = false;
			LOST++;
		}
		return correct;
	}
	private void updateMask(int position, char c) {
		String newMask = "";
		for (int i = 0; i < masked.length(); i++) {
			if (i == position) {
				newMask += String.valueOf(c);
			} else {
				newMask += masked.charAt(i);
			}
		}
		masked = newMask;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
	public boolean isWon() {
		return won;
	}
}
	


	