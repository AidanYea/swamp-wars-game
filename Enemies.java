import javax.swing.JOptionPane;


public class Enemies implements DietBehaviour {



	public void eats() {
		JOptionPane.showMessageDialog(null, "Hek loves enemies now!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Enemies)) {
			return false;
		}
		else return true;
	}

}
