
public class ComController {
	startGameCom start;
	moveCom move;
	changeDietCom changeDiet;
	varySwampCom varySwamp;
	
	public ComController() {}
	
	public void setStartCom(startGameCom doStartGame) {
		start = doStartGame;
	}
	
	public void setMoveCom(moveCom doMove) {
		move = doMove;
	}
	
	public void setChangeDietCom (changeDietCom doDietChange) {
		changeDiet = doDietChange;
	}
	
	public void setVarySwampCom(varySwampCom doVarySwamp) {
		varySwamp = doVarySwamp;
	}
	
	public void startGamePushed() {
		start.execute();
	}
	
	public void movePushed() {
		move.execute();
	}
	
	public void undoMovePushed() {
		move.undo();
	}
	
	public void changeDietPushed() {
		changeDiet.execute();
	}
	
	public void undoChangeDietPushed() {
		changeDiet.undo();
	}
	
	
	public void varySwampPushed() {
		varySwamp.execute();
	}

}
