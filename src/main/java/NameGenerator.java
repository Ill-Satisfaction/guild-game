import java.io.IOException;
import 	java.lang.Math;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class NameGenerator {
	private ArrayList<String> syls;

	public void fileReader(String fname) throws IOException{
		File report = new File ("main/resources/" + fname + ".txt");
		Scanner sc = new Scanner(report);
		String syl = "";
		syls = new ArrayList<String>();
		while (sc.hasNextLine()) {
			syls.add(sc.nextLine());
		}
		sc.close();
	}

	public String syllableReader(String fname) throws IOException {
		double doubleRand1 = Math.random() * syls.size();
		int rand1 = (int) Math.floor(doubleRand1);
		String returnSyl = syls.get(rand1);
		return returnSyl;
	}
	public String syllabicNameGenerator(String fname) throws IOException {
		fileReader(fname);
		String name = "";
		for(int i = 0; i < 3; i++){
			name += syllableReader(fname);
		}
		System.out.print(name);
		return "";
	}
}
