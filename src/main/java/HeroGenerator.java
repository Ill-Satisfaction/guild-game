import java.io.IOException;
import java.util.ArrayList;

public class HeroGenerator {
    public void heroGenerator() throws IOException {
        NameGenerator ng = new NameGenerator();
        System.out.println(ng.syllabicNameGenerator("peopleSyllables", 3));
        String[] statTypes = {"Strength", "Intelligence", "Dexterity", "Faith"};
        String[] classes = {"Warrior", "Wizard", "Rogue", "Cleric"};
        int[] statValues = {0,0,0,0};

        double doubleRand2 = Math.random() * classes.length;
        int rand2 = (int) Math.floor(doubleRand2);
        System.out.print(classes[rand2]);

        switch(classes[rand2]){
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
            double doubleRand1 = Math.random() * 18;
            doubleRand1 += 7;
            int rand1 = (int) Math.floor(doubleRand1);
            statValues[i] += rand1;
            System.out.print("\n" + statTypes[i] + ": " + statValues[i]);
        }
    }
}
