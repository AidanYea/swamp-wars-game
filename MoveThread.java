
public class MoveThread implements Runnable {

	private int time;
	
	public MoveThread() {
		setTime(4000);
	}

	public void run() {
		System.out.println("Making move!");
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
