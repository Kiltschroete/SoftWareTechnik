

public class Board {

	private int MatchesInGame;
	
	public Board() {
		;
	}
	
	
	public int getMatchesInGame() {
		return MatchesInGame;
	}

	
	public void setMatchesInGame(int NumOfMatches) {
		MatchesInGame = NumOfMatches;
	}

	
	public String toString() {
		return "Verbleibende Streichhoelzer: " + MatchesInGame;
	}
	
	
	public boolean checkIfValidMove (int MatchesInGame, int MatchesTaken) {
		
		if (0 < MatchesTaken && MatchesTaken < 4) {
			if ((MatchesInGame - MatchesTaken) > 0 ) {
				return true;
			}
		}
		System.out.println("Bitte gib eine Zahl zwischen 1 und 3 ein.");
		return false;
		
	}
	
	
	public boolean checkIfValidStart (int MatchesToStart) {
		
		if (0 < MatchesToStart) {
			return true;
		}
		System.out.println("Bitte gib eine Zahl groesser als 0 ein.");
		return false;
		
	}
	
	
}
