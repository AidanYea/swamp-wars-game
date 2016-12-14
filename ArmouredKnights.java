import javax.swing.JOptionPane;


public class ArmouredKnights implements DietBehaviour {

	

	public void eats() {
		JOptionPane.showMessageDialog(null, "Hek loves Armoured Knights now!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof ArmouredKnights)) {
			return false;
		}
		else return true;
	}
}
