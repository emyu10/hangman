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
		Font bfont = new Font("sans-serif", Font.BOLD, 15);
		ActionListener playListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.play(e.getActionCommand().charAt(0));
			}
		};
		JButton A = new JButton ("A");
		A.setFont(bfont);
		A.addActionListener(playListener);
		JButton B = new JButton ("B");
		B.setFont(bfont);
		B.addActionListener(playListener);
		JButton C = new JButton ("C");
		C.setFont(bfont);
		C.addActionListener(playListener);
		JButton D = new JButton ("D");
		D.setFont(bfont);
		D.addActionListener(playListener);
		JButton E = new JButton ("E");
		E.setFont(bfont);
		E.addActionListener(playListener);
		JButton F = new JButton ("F");
		F.setFont(bfont);
		F.addActionListener(playListener);
		JButton G = new JButton ("G");
		G.setFont(bfont);
		G.addActionListener(playListener);
		JButton H = new JButton ("H");
		H.setFont(bfont);
		H.addActionListener(playListener);
		JButton I = new JButton ("I");
		I.setFont(bfont);
		I.addActionListener(playListener);
		JButton J = new JButton ("J");
		J.setFont(bfont);
		J.addActionListener(playListener);
		JButton K = new JButton ("K");
		K.setFont(bfont);
		K.addActionListener(playListener);
		JButton L = new JButton ("L");
		L.setFont(bfont);
		L.addActionListener(playListener);
		JButton M = new JButton ("M");
		M.setFont(bfont);
		M.addActionListener(playListener);
		JButton N = new JButton ("N");
		N.setFont(bfont);
		N.addActionListener(playListener);
		JButton O = new JButton ("O");
		O.setFont(bfont);
		O.addActionListener(playListener);
		JButton P = new JButton ("P");
		P.setFont(bfont);
		P.addActionListener(playListener);
		JButton Q = new JButton ("Q");
		Q.setFont(bfont);
		Q.addActionListener(playListener);
		JButton R = new JButton ("R");
		R.setFont(bfont);
		R.addActionListener(playListener);
		JButton S = new JButton ("S");
		S.setFont(bfont);
		S.addActionListener(playListener);
		JButton T = new JButton ("T");
		T.setFont(bfont);
		T.addActionListener(playListener);
		JButton U = new JButton ("U");
		U.setFont(bfont);
		U.addActionListener(playListener);
		JButton V = new JButton ("V");
		V.setFont(bfont);
		V.addActionListener(playListener);
		JButton W = new JButton ("W");
		W.setFont(bfont);
		W.addActionListener(playListener);
		JButton X = new JButton ("X");
		X.setFont(bfont);
		X.addActionListener(playListener);
		JButton Y = new JButton ("Y");
		Y.setFont(bfont);
		Y.addActionListener(playListener);
		JButton Z = new JButton ("Z");
		Z.setFont(bfont);
		Z.addActionListener(playListener);
		
		JButton New = new JButton ("NEW");
		New.setFont(bfont);
		
		New.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				parent.newGame();
			}
		});
		
		setLayout(new GridLayout(9,3));
        add(A); 
        add(B);
        add(C);
        add(D);
        add(E);
        add(E);
        add(F);
        add(G);
        add(H);
        add(I);
        add(J);
        add(K);
        add(L);
        add(M);
        add(N);
        add(O);
        add(P);
        add(Q);
        add(R);
        add(S);
        add(T);
        add(U);
        add(V);
        add(W);
        add(X);
        add(Y);
        add(Z);
		add(New);//every new word will be displayed by clicking this button
		
       
		
		
	}
}
