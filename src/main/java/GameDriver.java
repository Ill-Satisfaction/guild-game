import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GameDriver {

	
	
	
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		GameState gs = new GameState();
		
		boolean gameGoing = true;
		while(gameGoing) {								//	GAME LOOP
			outputStream(getReport("testFile", gs));		//	! PRINT report
			if(GameState.isGame_done()) gameGoing=false;	//	? terminate
			if(gameGoing) switchboard(in.nextLine(), gs);	//	+ take INPUT
			turnStartUpdate(gs);							// 	! UPDATE
		}
		
		in.close();
	}
	
	
	
	
	
	private static void outputStream (String s) {		// prints to console (for now)
		System.out.println(s);
	}
	
	private static String getReport(String fname, GameState gs) throws IOException {
		/*File report = new File( "text/" + fname +".txt" );
		Scanner sc = new Scanner(report);;
		String retval = "";
		while (sc.hasNextLine())
			retval += "\r" + sc.nextLine();
		sc.close();
		
		return retval;*/
		
		NameGenerator ng = new NameGenerator();
		ng.syllabicNameGenerator("peopleSyllables");
		
		return "";
	}
	
	private static void switchboard(String input, GameState gs) {
		if 		(Integer.parseInt(input)==1) gs.changeGold(3);
		else 	gs.changeGpMo(1);
	}
	
	private static void turnStartUpdate (GameState gs) {
		gs.incTurn(); 										//	! increase turn count
		gs.changeGold(gs.getGpMo()); 						//	! income
		if (gs.getGold()>20) GameState.setGame_done(true); 	//	? end game
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


