import java.io.IOException;
import java.util.ArrayList;

public class HeroGenerator {
    public void heroGenerator() throws IOException {
        NameGenerator ng = new NameGenerator();
        System.out.println(ng.syllabicNameGenerator("peopleSyllables", 3));
        String[] statTypes = {"Strength", "Intelligence", "Dexterity", "Faith"};
        String[] classes = {"Warrior", "Wizard", "Rogue", "Cleric"};
        int[] statValues = {0,0,0,0};

        double doubleRand0 = Math.random() * classes.length;
        int rand0 = (int) Math.floor(doubleRand0);
        System.out.print(classes[rand0]);

        switch(classes[rand0]){
            case "Warrior":
                statValues[0] += 10;
                break;
            case "Wizard":
                statValues[1] += 10;
                break;
            case "Rogue":
                statValues[2] += 10;
                break;
            case "Cleric":
                statValues[3] += 10;
                break;
        }

        for(int i = 0; i < statValues.length; i++){
            double doubleRand1 = Math.random() * 9;
            doubleRand1 += 1;
            int rand1 = (int) Math.floor(doubleRand1);
            double doubleRand2 = Math.random() * 9;
            doubleRand2 += 1;
            int rand2 = (int) Math.floor(doubleRand2);
            int randResult = rand1 + rand2;
            statValues[i] += randResult;
            System.out.print("\n" + statTypes[i] + ": " + statValues[i]);
        }
    }
}
