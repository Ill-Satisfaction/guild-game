public class Hero {
	public String heroName;
	public String heroClass;
	public int[] heroStats;

	public Hero (String hName, String hClass, int[] hStats) {
		heroName = hName;
		heroClass = hClass;
		heroStats = hStats;
	}
	public void printData (){
		System.out.println(heroName);
		System.out.println(heroClass);
		System.out.println(heroStats);
	}
	
}
