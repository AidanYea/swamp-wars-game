import java.util.Random;
import javax.swing.JOptionPane;

public class changeDietCom implements Command {
	
	Hek hek;
	Random rand = new Random();
	int x;
	DietBehaviour prevDiet;
	DietBehaviour currentDiet;
	
	public changeDietCom(Hek hek) {
		this.hek = hek;
	}
	public void execute() {
		x = rand.nextInt(3) + 1;
		prevDiet = hek.getDietBehaviour();
		if (x == 1) {
			
			hek.setDietBehaviour(new Enemies());
			JOptionPane.showMessageDialog(null, "Hek's diet has been changed!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);
			
			currentDiet = hek.getDietBehaviour();
			hek.performDiet();
			
			if (prevDiet.equals(currentDiet)) {
			    JOptionPane.showMessageDialog(null, "Diet hasn't changed!", "Current Diet = Prev Diet", JOptionPane.INFORMATION_MESSAGE);
			    undo();
			}
			
		}
		else if (x == 2) {
			
			hek.setDietBehaviour(new ArmouredKnights());
			JOptionPane.showMessageDialog(null, "Hek's diet has been changed!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);
			
			currentDiet = hek.getDietBehaviour();
			hek.performDiet();
			
			if (prevDiet.equals(currentDiet)) {
			    JOptionPane.showMessageDialog(null, "Diet hasn't changed!", "Current Diet = Prev Diet", JOptionPane.INFORMATION_MESSAGE);
			    undo();
			}
			
		}
		else if (x == 3) {
			
			hek.setDietBehaviour(new BigMac());
			JOptionPane.showMessageDialog(null, "Hek's diet has been changed!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);
			
			currentDiet = hek.getDietBehaviour();
			hek.performDiet();
			
			
			if (prevDiet.equals(currentDiet)) {
			    JOptionPane.showMessageDialog(null, "Diet hasn't changed!", "Current Diet = Prev Diet", JOptionPane.INFORMATION_MESSAGE);
			    undo();
			}
		}
		
	}
	
	public void undo() {
		
		JOptionPane.showMessageDialog(null, "Undoing diet change...", "Undoing Diet Change", JOptionPane.INFORMATION_MESSAGE);
		hek.setDietBehaviour(prevDiet);
		hek.performDiet();
	}

}
