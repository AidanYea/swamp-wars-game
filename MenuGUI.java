import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class MenuGUI extends JFrame implements ActionListener {

	public MenuGUI() {
		setTitle("Welcome to Swamp Wars!");
		setSize(800, 800);
		setLocationRelativeTo(null);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame menu = new MenuGUI();
		menu.setVisible(true);
	}

}
