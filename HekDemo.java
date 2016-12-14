
public class HekDemo {

	public static void main(String[] args) {
		
		Hek hek = new Hek();
		
		hek.printDetails();
		hek.performDiet();
		hek.setDietBehaviour(new Enemies());
		hek.printDetails();
		hek.performDiet();
		
		

	}

}
