
public class EnemyFactory {
	

	
	
	public Enemy createEnemy(int i){
		Enemy enemy = null;
		
		if(i == 1) {
			enemy = new Donkey();
			enemy.setName("Donkey");
		}
		else if(i == 2) {
			enemy = new Parrot();
			enemy.setName("Parrot");
		}
		else if(i == 3) {
			enemy = new Snake();
			enemy.setName("Snake");
		}	
		return enemy;
	}
}
