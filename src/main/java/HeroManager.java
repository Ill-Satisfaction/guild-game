package guildGame;

import java.util.ArrayList;

public class HeroManager {
	private ArrayList<Hero> heroList;
	
	public HeroManager () {
		heroList = new ArrayList<Hero>();
	}
	
	public int numHeros () {
		return heroList.size();
	}

}
