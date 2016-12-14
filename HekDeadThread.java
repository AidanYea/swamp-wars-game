
public class HekDeadThread implements Runnable {

private int time;
	
	public HekDeadThread() {
		setTime(5000);
	}
	
	public void run() {
		System.out.println("Hek is dead! Game Over!");
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
