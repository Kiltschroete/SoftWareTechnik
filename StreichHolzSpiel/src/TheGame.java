

import java.util.*;

public class TheGame {

	public static void main(String[] args) {
		
		System.out.println("STREICHHOLZSPIEL");
		System.out.println("Es werden abwechselnd 1-3 Streichhoelzer gezogen.");
		System.out.println("Wer das letzte Streichholz zieht verliert.");
		
		int NumberOfPlayers = 2;
	    List<Player> PlayerList = new ArrayList<Player>();
	    
		System.out.println("Wie ist dein Name?");
		Scanner NameScan = new Scanner(System.in);
		String PlayerName = NameScan.nextLine();
				
		PlayerList.add(new AiPlayer("Computer"));
		PlayerList.add(new HumanPlayer(PlayerName));
   	    
	    int ActivePlayerID = (int)(Math.random() * NumberOfPlayers);
    
 	    Player activePlayer = PlayerList.get(ActivePlayerID);
 	    
 	    if(ActivePlayerID % NumberOfPlayers > 0){						//if Player is HumanPlayer
 		  System.out.println("Mit wievielen Streichhoelzern willst du spielen?");
		}
 	    
 	    Board board = new Board();
 	    int MatchesInGame = 0;
 	    
 	    Boolean valid = true;
 	    while (valid == true){
 	    	MatchesInGame = activePlayer.getNumStartMatches();
			if (board.checkIfValidStart(MatchesInGame)){
				board.setMatchesInGame(MatchesInGame);
				System.out.println("Es wird mit " + MatchesInGame + " Streichhoelzern gespielt!");
				valid = false;
			}
 	    }
		
		int MatchesTaken = 0;
		
		while (true) {
					
			activePlayer = PlayerList.get(ActivePlayerID % NumberOfPlayers);
						
			if (MatchesInGame == 1) {
				System.out.println(activePlayer.getName() + " hat verloren!");
				break;
			}
			
			if(ActivePlayerID % NumberOfPlayers > 0){						//if Player is HumanPlayer
				System.out.println("Wieviele Streichhoelzer willst du nehmen?");
			}
						
			MatchesTaken = activePlayer.getMatchesToTake(MatchesInGame);
			
			if (board.checkIfValidMove(MatchesInGame, MatchesTaken)) {
				board.setMatchesInGame(MatchesInGame - MatchesTaken);
				if(ActivePlayerID % NumberOfPlayers == 0){					//if Player is AiPlayer
					System.out.println("Computer nimmt " + MatchesTaken);
				}
				ActivePlayerID ++;
				MatchesInGame = board.getMatchesInGame();
				System.out.println(board.toString());
			}
			
		}

	}

}
