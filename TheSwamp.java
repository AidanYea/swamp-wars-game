
import java.util.Arrays;
import java.util.Random;




public class TheSwamp extends Swamp  {

	Object[][] gameMap = null;
	
	
	
	
	
	public TheSwamp() {
		
		
		gameMap = new Object[4][4];
		System.out.println("The swamp has been created!");
		
		
		
		//Setting first "[0][0]" element to 0 then setting the rest of the values within 
		for (int y = 0; y < (gameMap.length); y++) {
			for (int x = 0; x < (gameMap.length); x++)
			gameMap[y][x] = "..";
		}
		
	}

	public TheSwamp(int x, int y) {
		
		
		
		gameMap = new Object[y][x];
		System.out.println("The swamp has been created!");
		for (int y1 = 0; y1 < (gameMap.length); y1++) {
			for (int x1 = 0; x1 < (gameMap.length); x1++)
			gameMap[y1][x1] = "..";
		}
			
	}
	
	public void addHek(Hek hek, int x, int y) {
		gameMap[x][y] = hek.getName();
	}
	
	public void initializeHekToSwamp(Hek hek) {
		Random rand = new Random();
		int randomInt = rand.nextInt(gameMap.length);
		int randomInt2 = rand.nextInt(gameMap.length);
		
		
		int x = randomInt;
		int y = randomInt2;
		
		if (x == 0 && y == 0) {
			x += 1;
			y += 1;
			
			hek.setPosition(x, y);
			hek.getXPosition();
			hek.getYPosition();
			
			this.addHek(hek, x, y);
		} else {
			hek.setPosition(x, y);
			hek.getXPosition();
			hek.getYPosition();
			
			this.addHek(hek, x, y);
		}
		
		
	}
	
	public void moveHek(Hek hek, int move) {

		
		boolean moveNotMade = true;
		
		while (moveNotMade) {
			
			int newMove = move;
			hek.setMove(newMove);
			int x = hek.getMove();
			int prevXPos = hek.getXPosition();
			int prevYPos = hek.getYPosition();
			
			if (x == 1) {
				if (prevXPos > 0 && prevYPos > 0) { //this if while checks that Hek's position isn't located within the top row  
					hek.setPosition(prevXPos - 1, prevYPos - 1); //and he isn't positioned within the first column of the map
					int newX = hek.getXPosition(); //and then moves Hek into the position that is diagonally left upwards to him.
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 2) {
				if (prevXPos > 0) { //this if while checks that Hek's position isn't located within the top row and then
					hek.setPosition(prevXPos - 1, prevYPos); //moves Hek into the position that is directly above him.
					int newX = hek.getXPosition();
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 3) {
				if (prevXPos > 0 && prevYPos < gameMap.length - 1) { //this if while checks that Hek's position isn't located within the top row
					hek.setPosition(prevXPos - 1, prevYPos + 1); //and he isn't positioned in the last column of the map, then moves him into the
					int newX = hek.getXPosition(); //position that is diagonally right upwards to him.
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 4) {
				if (prevYPos < gameMap.length - 1){ //this if while checks that Hek's position isn't located within the first column of the map and then
					hek.setPosition(prevXPos, prevYPos + 1); //moves him into the position that is directly right.
					int newX = hek.getXPosition();
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 5) {
				if (prevYPos > 0) { //this if while checks that Hek's position isn't located within the last column of the map and then
					hek.setPosition(prevXPos, prevYPos - 1); //moves him into the position that is directly left.
					int newX = hek.getXPosition();
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 6) {
				if (prevXPos < gameMap.length - 1 && prevYPos > 0) { //this if while checks that Hek's position isn't located within the last row of the map and
					hek.setPosition(prevXPos + 1, prevYPos - 1); //that his position isn't located in the first column, then moves him into the position
					int newX = hek.getXPosition(); //that is diagonally left downwards to him.
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 7) {
				if (prevXPos < gameMap.length - 1) { //this if while checks that Hek's position isn't located within the last row of the map and then moves
					hek.setPosition(prevXPos + 1, prevYPos); //him into the position directly below him.
					int newX = hek.getXPosition();
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 8) {
				if (prevXPos < gameMap.length - 1 && prevYPos < gameMap.length - 1) { //this if while checks that Hek's position isn't located within the last row
					hek.setPosition(prevXPos + 1, prevYPos + 1); //and the last column of the map, then it moves him into the position that is diagonally
					int newX = hek.getXPosition(); //right downwards to him.
					int newY = hek.getYPosition();
					this.addHek(hek, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} 
		}
		
		
	}
	
	public void intializeEnemyToSwamp(Enemy enemy) {
		
		int x = 0;
		int y = 0;
		enemy.setPosition(x, y);
		enemy.getXPosition();
		enemy.getYPosition();
		this.addEnemyToSwamp(enemy, x, y);
		
	}
	
	public void moveEnemy(Enemy enemy, int move) {

		
		boolean moveNotMade = true;
		
		while (moveNotMade) {
			
			int newMove = move;
			enemy.setMove(newMove);
			int x = enemy.getMove();
			int prevXPos = enemy.getXPosition();
			int prevYPos = enemy.getYPosition();
			
			if (x == 1) {
				if (prevXPos > 0 && prevYPos > 0) { //this if while checks that Enemy's position isn't located within the top row  
					enemy.setPosition(prevXPos - 1, prevYPos - 1); //and he isn't positioned within the first column of the map
					int newX = enemy.getXPosition(); //and then moves Enemy into the position that is diagonally left upwards to him.
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 2) {
				if (prevXPos > 0) { //this if while checks that Enemy's position isn't located within the top row and then
					enemy.setPosition(prevXPos - 1, prevYPos); //moves Enemy into the position that is directly above him.
					int newX = enemy.getXPosition();
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 3) {
				if (prevXPos > 0 && prevYPos < gameMap.length - 1) { //this if while checks that Enemy's position isn't located within the top row
					enemy.setPosition(prevXPos - 1, prevYPos + 1); //and he isn't positioned in the last column of the map, then moves him into the
					int newX = enemy.getXPosition(); //position that is diagonally right upwards to him.
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 4) {
				if (prevYPos < gameMap.length - 1){ //this if while checks that Enemy's position isn't located within the first column of the map and then
					enemy.setPosition(prevXPos, prevYPos + 1); //moves him into the position that is directly right.
					int newX = enemy.getXPosition();
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 5) {
				if (prevYPos > 0) { //this if while checks that Enemy's position isn't located within the last column of the map and then
					enemy.setPosition(prevXPos, prevYPos - 1); //moves him into the position that is directly left.
					int newX = enemy.getXPosition();
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 6) {
				if (prevXPos < gameMap.length - 1 && prevYPos > 0) { //this if while checks that Enemy's position isn't located within the last row of the map and
					enemy.setPosition(prevXPos + 1, prevYPos - 1); //that his position isn't located in the first column, then moves him into the position
					int newX = enemy.getXPosition(); //that is diagonally left downwards to him.
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 7) {
				if (prevXPos < gameMap.length - 1) { //this if while checks that Enemy's position isn't located within the last row of the map and then moves
					enemy.setPosition(prevXPos + 1, prevYPos); //him into the position directly below him.
					int newX = enemy.getXPosition();
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} else if(x == 8) {
				if (prevXPos < gameMap.length - 1 && prevYPos < gameMap.length - 1) { //this if while checks that Enemy's position isn't located within the last row
					enemy.setPosition(prevXPos + 1, prevYPos + 1); //and the last column of the map, then it moves him into the position that is diagonally
					int newX = enemy.getXPosition(); //right downwards to him.
					int newY = enemy.getYPosition();
					this.addEnemyToSwamp(enemy, newX, newY);
					moveNotMade = false;
				} else moveNotMade = true;
			} 
		}
		
		
	}
	
	public void updateSwamp(Hek hek, Enemy enemy) {
		int x = hek.getXPosition();
		int y = hek.getYPosition();
		
		gameMap[x][y] = "..";
		
		int x2 = enemy.getXPosition();
		int y2 = enemy.getYPosition();
		
		gameMap[x2][y2] = "..";
	}
	
	public void addEnemyToSwamp(Enemy enemy, int x, int y) {
		gameMap[x][y] = enemy.getName();
	}
	
	
	public void displaySwamp() {
		System.out.println(Arrays.deepToString(gameMap).replace("], ", "]\n"));
	}
	
	public static void main(String[] args) {
		
		Hek hek = new Hek();
		Random rand = new Random();
		int randomInt = rand.nextInt(3) + 1;
		int moveInt = rand.nextInt(8) + 1;
		EnemyCreator theEnemy = new EnemyCreator();
		
		
		TheSwamp theSwamp = new TheSwamp(4, 4);
		theSwamp.displaySwamp();

		Enemy enemy = null;
		enemy = theEnemy.addCreatedEnemy(randomInt);
		theSwamp.intializeEnemyToSwamp(enemy);
		theSwamp.displaySwamp();
		theSwamp.initializeHekToSwamp(hek);
		
		theSwamp.displaySwamp();
		theSwamp.updateSwamp(hek, enemy);
//
		theSwamp.moveHek(hek, moveInt);
		theSwamp.moveEnemy(enemy, moveInt);
		theSwamp.displaySwamp();
		
//		final JFrame f = new JFrame("Frame Test");
//
//        JPanel panel = new JPanel(new GridLayout(4, 4));
//
//        for (int i = 0; i < 16; i++) {
//            
//            JLabel l = new JLabel(new ImageIcon("/CourseworkAY/imagesres/NormalSwap.gif"), JLabel.CENTER);
//            l.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
//            l.setFont(l.getFont().deriveFont(20f));
//            panel.add(l);
//        }
//
//        f.setContentPane(panel);
//        f.setSize(200, 200);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
		
	}


}
