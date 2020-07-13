import java.util.ArrayList;

public class HeroManager {
	public ArrayList<Hero> heroList;
	
	public HeroManager () {

		heroList = new ArrayList<Hero>();

	}
	public void heroAdder (Hero hero) {
		heroList.add(hero);
	}
	public int numHeroes () {
		return heroList.size();
	}

	public void heroNames () {
		for (Hero h : heroList)
			System.out.println( h.heroName );
	}

}
