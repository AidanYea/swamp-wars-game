import java.util.Random;

import javax.swing.*;

public abstract class Ogre {
	
	Random rand = new Random();
	int move = rand.nextInt(8) + 1;
	int xPosition;
	int yPosition;
	String name;
	
	protected DietBehaviour dietBehaviour;

	
	public Ogre(){}


	public DietBehaviour getDietBehaviour() {
		return dietBehaviour;
	}

	public void setDietBehaviour(DietBehaviour dietBehaviour) {
		this.dietBehaviour = dietBehaviour;
	}
	public void performDiet()
	{
		this.dietBehaviour.eats();
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


	public void printDetails() {
		//JOptionPane.showMessageDialog(null, name + " is making his move", "Calculating move", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, name + " moved into " + move, "Move Calculated", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	

}
