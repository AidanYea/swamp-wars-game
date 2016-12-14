import java.util.Random;
public class EnemyDemo {

	public static void main(String[] args) {
		
		
		
		EnemyCreator theEnemy = new EnemyCreator();
		Random rand = new Random();
	
		
		int RandomInt = rand.nextInt(3) + 1;
		
	
		theEnemy.addCreatedEnemy(RandomInt);
		
			

		
		
		

	}

}
