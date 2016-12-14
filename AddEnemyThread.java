
public class AddEnemyThread implements Runnable {

	private int time;
	
	public AddEnemyThread() {
		setTime(4000);
	}

	public void run() {
		System.out.println("Adding Enemy!");
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
