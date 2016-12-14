
public class StartGameThread implements Runnable {

	private int time;
	
	public StartGameThread() {
		setTime(4000);
	}
	
	public void run() {
		System.out.println("Starting game!");
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
