import java.util.ArrayList;


public class GameBehaviour {
	
	ArrayList<Enemy> enemyList;
	Hek hek;
	Enemy enemy;
	DietBehaviour diet;
	ArmouredKnights armouredKnights = new ArmouredKnights();
	BigMac bigMac = new BigMac();
	Enemies enemies = new Enemies();




	public GameBehaviour() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean checkNoEnemiesLeft(ArrayList<Enemy> enemyList) {
		boolean check = false;
		if(enemyList.isEmpty()) {
			check = true;
		}
		else check = false;
		return check;
		
	}
	
	public boolean checkHekAndEnemyIntersect(Hek hek, Enemy enemy) {
		boolean check = false;
		if(hek.getXPosition() == enemy.getXPosition() && hek.getYPosition() == enemy.getYPosition()) {
			check = true;
		}
		else check = false;
		return check;
	}
	
	
	
	public boolean checkHekDietIsEnemies(DietBehaviour diet) {
		boolean check = false;
		if(diet.equals(enemies)) {
			check = true;
		}
		else check = false; 
			return check;
	}
	
	public int checkNumberOfEnemiesInHekPos(Hek hek, ArrayList<Enemy> enemyList, Enemy enemy) {
		
		int numberOf = 0;
		for(int i = 0; i<enemyList.size(); i++ ){
			enemy = enemyList.get(i);
			if (checkHekAndEnemyIntersect(hek, enemy)) {
				numberOf+=1;
			} else {
				
			}
			
		} 
		return numberOf;
		
	}
	
	public boolean canHekKill() {
		boolean check = false;
		if (checkHekDietIsEnemies(diet) && checkNumberOfEnemiesInHekPos(hek, enemyList, enemy) <= 2){
			check = true;
		} else if (!checkHekDietIsEnemies(diet) && checkNumberOfEnemiesInHekPos(hek, enemyList, enemy) < 2){
			check = true;
		} else if (checkNumberOfEnemiesInHekPos(hek, enemyList, enemy) > 2){
			check = false;
		} 
		return check;
	}
	
	public void killEnemy(ArrayList<Enemy> enemyList, Enemy enemy) {
		if (canHekKill()) {
			enemyList.remove(enemy);
		}
	}
	
	public void killHek() {
		if (!canHekKill()) {
			System.out.println("Hek is dead");
			Thread HekDead = new Thread(new HekDeadThread());
			HekDead.run();
			System.exit(0);
		}
			
	}
	
	
	

	
	
	


}
