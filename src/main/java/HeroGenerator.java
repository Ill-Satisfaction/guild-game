import java.io.IOException;
import java.util.ArrayList;

public class HeroGenerator {
    public HeroGenerator(HeroManager hm) throws IOException {
        NameGenerator ng = new NameGenerator();

        String[] statTypes = {"Strength", "Intelligence", "Dexterity", "Spirit"};
        String[] classes = {"Warrior", "Wizard", "Rogue", "Cleric"};
        int[] statValues = {0,0,0,0};
        double doubleRand0 = Math.random() * classes.length;
        int rand0 = (int) Math.floor(doubleRand0);
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
        }
        Hero newHero = new Hero(ng.syllabicNameGenerator("peopleSyllables", 3), classes[rand0], statValues);
        //newHero.printData();
        hm.heroAdder(newHero);
        System.out.println(hm.numHeroes());


    }

}
