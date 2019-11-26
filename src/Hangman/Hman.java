package Hangman;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Hman extends JPanel{
	HFrame parent;
	boolean hasHead = false;
	boolean hasBody = false;
	boolean hasLeftArm = false;
	boolean hasRightArm = false;
	boolean hasLeftLeg = false;
	boolean hasRightLeg = false;
	boolean isHanged = false;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g.drawLine(20, 20, 90, 20);
		g.drawLine(20, 20, 20, 150);
		g.fillRect(10, 150, 60, 20);
		if (hasBody) {
			g.fillOval(70, 30, 20, 20);//head
			g.drawLine(80, 20, 80, 100);//body	
		}
		if (hasLeftArm) {
			g.drawLine(80, 60, 100, 70);//left hand
		}
		if (hasRightArm) {
			g.drawLine(80, 60, 60, 70);//right hand
		}
		if (hasRightLeg) {
			g.drawLine(80, 100, 60, 140);//right leg
		}
		if (hasLeftLeg) {
			g.drawLine(100, 140, 80, 100);//left leg
		}
		if (isHanged) {
			g.drawLine(80, 20, 80, 30);//line above head
			g.drawLine(80, 20, 20, 50);//cross line
		}
		
		
	}
	public void drawHead() {
		hasHead = true;
		repaint();
	}
	public void drawBody() {
		hasBody = true;
		repaint();
	}
	public void drawLeftArm() {
		hasLeftArm = true;
		repaint();
	}
	public void drawRightArm() {
		hasRightArm = true;
		repaint();
	}
	public void drawLeftLeg() {
		hasLeftLeg = true;
		repaint();
	}
	public void drawRightLeg() {
		hasRightLeg = true;
		repaint();
	}
	public void drawHanged() {
		isHanged = true;
		repaint();
	}
	
	Hman(HFrame p){
		
		parent = p;
		repaint();			
		
	}
	public void drawNext() {
		if (hasRightLeg)
			drawHanged();
		if (hasLeftLeg)
			drawRightLeg();
		if (hasRightArm)
			drawLeftLeg();
		if (hasLeftArm)
			drawRightArm();
		if (hasBody)
			drawLeftArm();
	
		drawBody();
		
		
	}
	public void reset() {
		hasBody = false;
		hasHead = false;
		hasBody = false;
		hasLeftArm = false;
		hasRightArm = false;
		hasLeftLeg = false;
		hasRightLeg = false;
		isHanged = false;
		repaint();
		
	}

}


