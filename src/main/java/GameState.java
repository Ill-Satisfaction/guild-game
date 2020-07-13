public class GameState {
	private static boolean game_done = false;
	private static int turn;
	private static int Gold;
	private static int GpMo;
	private static HeroManager hm = new HeroManager();

	public int getGold() {
		return Gold;
	}
	
	public void changeGold(int goldIncrement) {
		GameState.Gold += goldIncrement;
	}

	public HeroManager getHm() {
		return hm;
	}

	public void setHm(HeroManager hm) {
		GameState.hm = hm;
	}

	public int getGpMo() {
		return GpMo;
	}

	public void changeGpMo(int gpMo) {
		GpMo += gpMo;
	}

	public int getTurn() {
		return turn;
	}

	public void incTurn() {
		GameState.turn++;
	}

	public static boolean isGame_done() {
		return game_done;
	}

	public static void setGame_done(boolean game_done) {
		GameState.game_done = game_done;
	}
	
	

}
