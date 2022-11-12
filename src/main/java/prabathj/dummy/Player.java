package main.java.prabathj.dummy;

public class Player {
	private final int player;
	private  int location;
	private boolean sFieldActivated;
	private boolean saveFromnextTrap;
	private boolean skipNextTurn;
	
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public boolean issFieldActivated() {
		return sFieldActivated;
	}
	public void setsFieldActivated(boolean sFieldActicated) {
		this.sFieldActivated = sFieldActicated;
	}
	public int getPlayer() {
		return player;
	}
	
	
	
	
	public boolean isSaveFromnextTrap() {
		return saveFromnextTrap;
	}
	public void setSaveFromnextTrap(boolean saveFromnextTrap) {
		this.saveFromnextTrap = saveFromnextTrap;
	}
	public boolean isSkipNextTurn() {
		return skipNextTurn;
	}
	public void setSkipNextTurn(boolean skipNextTurn) {
		this.skipNextTurn = skipNextTurn;
	}
	public Player(int player, int location, boolean sFieldActivated, boolean saveFromnextTrap, boolean skipNextTurn) {
		super();
		this.player = player;
		this.location = location;
		this.sFieldActivated = sFieldActivated;
		this.saveFromnextTrap = saveFromnextTrap;
		this.skipNextTurn = skipNextTurn;
	}
	
	

	
	
}
