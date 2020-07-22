import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class QuestGenerator {
    private static ArrayList<String> quests = new ArrayList<String>();
    public QuestGenerator() throws IOException {

        double doubleDiff = Math.random() * 6;
        doubleDiff += 1;
        int diff = (int) Math.floor(doubleDiff);
        System.out.println(diff);

        File report = new File("main/resources/questTypes.txt");
        Scanner sc = new Scanner(report);
        while (sc.hasNextLine()) {
            quests.add(sc.nextLine());
        }
        sc.close();
        System.out.println(quests);
        //switch(balls){


    }
}
