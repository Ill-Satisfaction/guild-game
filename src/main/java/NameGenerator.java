import java.io.IOException;
import 	java.lang.Math;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * this is a utility used to create random names from a file of random syllables.
 * call 'syllabicNameGenerator' in order to get a name
 */
public class NameGenerator {
	private static ArrayList<String> syls = new ArrayList<String>();
	private String randName = "";
	private int numSyls = 0;


	
	public String syllabicNameGenerator(String fname) throws IOException {
		return this.syllabicNameGenerator(fname, 3);
	}

	public String  syllabicNameGenerator(String fname, int numSyls) throws IOException{
		createSylsFromFile(fname);	// load syls from file into arraylist

		for(int i=0; i<numSyls; i++)	// string together random syllables
			randName += randSyl();
		randName = randName.substring(0,1).toUpperCase() + randName.substring(1);	// first letter to uppercase

		return randName;
	}

	private void createSylsFromFile(String fname) throws IOException{
		File report = new File ("main/resources/" + fname + ".txt");
		Scanner sc = new Scanner(report);
		while (sc.hasNextLine()) {
			syls.add(sc.nextLine());
		}
		sc.close();
	}

	private String randSyl() throws IOException {
		return syls.get( (int) Math.floor( Math.random()*syls.size() ) );
	}
}
