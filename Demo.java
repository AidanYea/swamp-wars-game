import java.util.ArrayList;
import java.util.Random;
public class Demo {

	public static void main(String[] args) {
		ComController comControl = new ComController();
		GameBehaviour gameBehaviour = new GameBehaviour();
		Thread StartThread = new Thread(new StartGameThread());
		Thread MoveThread = new Thread(new MoveThread());
		Thread AddEnemyThread = new Thread(new AddEnemyThread());
		
		Random rand = new Random();
		int RandomInt = rand.nextInt(3) + 1;
		
		Hek hek = new Hek();
		TheSwamp theSwamp = new TheSwamp();
		EnemyCreator theEnemy = new EnemyCreator();
		
		
		Enemy enemy = null;
		enemy = theEnemy.addCreatedEnemy(RandomInt);
		DietBehaviour diet;
		diet = hek.getDietBehaviour();
//		ArmouredKnights armouredKnights = new ArmouredKnights();
//		BigMac bigMac = new BigMac();
//		Enemies enemies = new Enemies();
		boolean endGame = false;
		

		ArrayList<Enemy> enemyList = new ArrayList<Enemy>();

		
		startGameCom startGame = new startGameCom(hek, theSwamp, theEnemy, enemy);
		comControl.setStartCom(startGame);
		StartThread.run();
		AddEnemyThread.run();
		comControl.startGamePushed();
		enemyList.add(enemy);
//		theSwamp.displaySwamp();
		
		
		varySwampCom varySwamp = new varySwampCom(theSwamp);
		changeDietCom changeDiet = new changeDietCom(hek);
		moveCom playMove = new moveCom(hek, theSwamp, enemy);
		
		
		comControl.setMoveCom(playMove);
		
			MoveThread.run();
			comControl.movePushed();
			MoveThread.run();
			comControl.movePushed();
			MoveThread.run();
			comControl.undoMovePushed();
			MoveThread.run();
			comControl.movePushed();
			
		
		
		
		
		System.out.println(enemyList);
	
		

		
		
		
		comControl.setVarySwampCom(varySwamp);
		comControl.varySwampPushed();
	
		comControl.setChangeDietCom(changeDiet);
		comControl.changeDietPushed();
		

		
		
		comControl.changeDietPushed();
		comControl.undoChangeDietPushed();

		
	}

}
