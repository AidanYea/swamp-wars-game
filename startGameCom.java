
public class startGameCom implements Command {

	Hek hek;
	TheSwamp theSwamp;
	EnemyCreator theEnemy;
	Enemy enemy;
	public startGameCom(Hek hek, TheSwamp theSwamp, EnemyCreator theEnemy, Enemy enemy) {

		this.setEnemy(enemy);
		this.setEnemyCreator(theEnemy);
		this.setHek(hek);
		this.setSwamp(theSwamp);

	}
	public void execute() {
		theSwamp.initializeHekToSwamp(hek);
		theSwamp.intializeEnemyToSwamp(enemy);
		theSwamp.displaySwamp();

	}
	
	public EnemyCreator getEnemyCreator() {
		return this.theEnemy;
	}
	
	public Hek getHek() {
		return this.hek;
	}
	
	public TheSwamp getSwamp() {
		return this.theSwamp;
	}
	
	public Enemy getEnemy() {
		return this.enemy;
	}
	
	public void setEnemyCreator(EnemyCreator theEnemy) {
		this.theEnemy = theEnemy;
	}
	
	public void setHek(Hek hek) {
		this.hek = hek;
	}
	
	public void setSwamp(TheSwamp theSwamp) {
		this.theSwamp = theSwamp;
	}
	
	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	
	
	
	

}
