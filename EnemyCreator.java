
public class EnemyCreator {

	EnemyFactory theFactory;
	
	
	public EnemyCreator() {
		
		setFactory(new EnemyFactory());
	}
	
	public Enemy addCreatedEnemy(int i) {
		
		Enemy enemy;
		enemy = this.theFactory.createEnemy(i);
		enemy.declareEnemyType();
		return enemy;
	}
	
	
	public void setFactory(EnemyFactory theFactory){
		this.theFactory = theFactory;
	}



	
	
	

}
