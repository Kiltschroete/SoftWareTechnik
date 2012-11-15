

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public int getMatchesToTake(int MatchesInGame) {
	
		Scanner scan = new Scanner(System.in);
		int NumMatches = 0;
		
		try{
			NumMatches = scan.nextInt();
		}catch ( InputMismatchException iME ){ 
		} 
		
		return NumMatches;

	}

	@Override
	public int getNumStartMatches() {

		Scanner scan = new Scanner(System.in);
		int NumStartMatches = 0;
		
		try{
			NumStartMatches = scan.nextInt();
		}catch ( InputMismatchException iME ){ 
			;
		} 
		
		return NumStartMatches;
		
	}
	
}
