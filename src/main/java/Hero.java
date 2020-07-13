public class Hero {
	public String heroName;
	public String heroClass;
	public int heroStr;
	public int heroInt;
	public int heroPer;
	public int heroFth;

	public Hero (String hName, String hClass, int[] hStats) {
		heroName = hName;
		heroClass = hClass;
		heroStr = hStats[0];
		heroInt = hStats[1];
		heroPer = hStats[2];
		heroFth = hStats[3];
	}

	public void printData (){
		System.out.println(heroName);
		System.out.println(heroClass);
		System.out.println("Strength: "+heroStr);
		System.out.println("Intelligence: "+heroInt);
		System.out.println("Perception: "+heroPer);
		System.out.println("Faith: "+heroFth);
	}
	
}
