

public class AiPlayer extends Player {


	public AiPlayer(String name) {
		super(name);
	}

	@Override
	public int getMatchesToTake(int MatchesInGame) {
			
		int TakeToWin = (MatchesInGame - 1) % 4;
		int NumMatchesToTake;
				
			if (TakeToWin != 0){			
				NumMatchesToTake = TakeToWin;
			}
			
			else {
				NumMatchesToTake = 1 + (int)(Math.random() * 3);
			}            
		
		return NumMatchesToTake;
	
	}

	@Override
	public int getNumStartMatches() {

		int NumStartMatches = 1 + 4 * ((int)(Math.random() * 42) + 1);
		return NumStartMatches;
	
	}
	
	
}
