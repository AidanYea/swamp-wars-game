import java.util.Random;
import javax.swing.*;

public class moveCom implements Command {
	
	Hek hek;
	TheSwamp theSwamp;
	Enemy enemy;
	Random rand = new Random();
	int hekMove;
	int enemyMove;
	int prevMove;
	
	public moveCom(Hek hek, TheSwamp theSwamp, Enemy enemy) {
		this.hek = hek;
		this.theSwamp = theSwamp;
		this.enemy = enemy;
	}

	public void execute() {
		
		prevMove = hek.getMove();
		hekMove = rand.nextInt(8) + 1;
		enemyMove = rand.nextInt(8) + 1;
		theSwamp.updateSwamp(hek, enemy);
		theSwamp.moveHek(hek, hekMove);
		theSwamp.moveEnemy(enemy, enemyMove);
		theSwamp.displaySwamp();
		

	}
	
	public void undo() {
		theSwamp.updateSwamp(hek,  enemy);
		theSwamp.moveHek(hek, prevMove);
		theSwamp.displaySwamp();
		JOptionPane.showMessageDialog(null, "Move has succesfully been undone!", "Move Undone!", JOptionPane.INFORMATION_MESSAGE);
		hek.printDetails();
	}

}
