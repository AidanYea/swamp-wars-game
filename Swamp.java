
public abstract class Swamp {
	
	int xSize;
	int ySize;
	
	public Swamp() {
		setxSize(4);
		setySize(4);
	}
	
	public Swamp(int x, int y){
		setxSize(x);
		setySize(y);
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}
	
	

}
