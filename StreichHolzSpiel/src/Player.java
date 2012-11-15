

public abstract class Player {

	private String name;
	
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract int getMatchesToTake(int MatchesInGame);
	public abstract int getNumStartMatches();
}
