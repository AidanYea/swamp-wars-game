import javax.swing.JOptionPane;


public class BigMac implements DietBehaviour {

	

	public void eats() {
		JOptionPane.showMessageDialog(null, "Hek loves Big Macs now!", "Changing diet", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof BigMac)) {
			return false;
		}
		else return true;
	}


}
