import java.util.Random;

import javax.swing.*;
public abstract class Enemy {
	
	protected String name;
	Random rand = new Random();
	int xPosition;
	int yPosition;
	int move = rand.nextInt(1) + 1;
	
	public Enemy() {
		getName();
		getXPosition();
		getYPosition();
	}
	
	public void declareEnemyType() {
		JOptionPane.showMessageDialog(null, "I am a " + name, "Enemy", JOptionPane.INFORMATION_MESSAGE);
		this.getMove();
		JOptionPane.showMessageDialog(null, "the " + name + " is moving into [" + xPosition + "][" + yPosition + "]", "Move calculated", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}
	
	public void setPosition(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;
	}
	
	public int getXPosition() {
		return xPosition;
	}
	
	public int getYPosition() {
		return yPosition;
	}
	
	

}
