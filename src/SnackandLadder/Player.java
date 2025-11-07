package SnackandLadder;


public class Player implements Comparable<Player>{

	private int rank=0;
	private int pos=0;
	private String name;
	private boolean iswin;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIswin() {
		return iswin;
	}
	public void setIswin(boolean iswin) {
		this.iswin = iswin;
	}
	public Player( String name, boolean iswin) {
		super();
		this.name = name;
		this.iswin = iswin;
	}
	@Override
	public String toString() {
		return "Player [rank=" + rank + ", pos=" + pos + ", name=" + name + ", iswin=" + iswin + "]";
	}
	@Override
	public int compareTo(Player o) {
		
		return this.rank-o.getRank();
	}
	
	
}