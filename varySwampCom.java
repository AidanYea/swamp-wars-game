import javax.swing.*;
public class varySwampCom implements Command {
	TheSwamp theSwamp;
	
	public varySwampCom(TheSwamp theSwamp) {
		this.theSwamp = theSwamp;
	}

	public void execute() {
		
		
		String swampSize = JOptionPane.showInputDialog("What size of swamp would you like? (enter one number for both x, y dimensions)");
		if (swampSize != null) {
			int i = Integer.parseInt(swampSize);
			theSwamp.setxSize(i);
			theSwamp.setySize(i);
			theSwamp = new TheSwamp(i, i);
			theSwamp.displaySwamp();
		 }
		 else {
			JOptionPane.showMessageDialog(null, "No number has been entered", "No number has been entered", JOptionPane.ERROR_MESSAGE);
		 }
		

	}

}
