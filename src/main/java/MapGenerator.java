import java.util.Arrays;
import java.util.Random;

public class MapGenerator {
    private MapSector[][] map;
    private Random rand;
    private int rInt;
    private int[] fringeVals;

    public MapGenerator (int mapSize) {
        map = new MapSector[mapSize][mapSize];
        rand = new Random();
        fringeVals = new int[]{0, 0, 0, 0};

        for (int i = 0; i<map.length; i++) {
            for (int j = 0; j<map[i].length; j++) {
                rInt = rand.nextInt(8);
                map[i][j] = new MapSector(rInt,0,0);
            }
        }

        //  smooth elevation - possibly the least efficient way to do this
        for (int i = 0; i<map.length; i++) {
            for (int j = 0; j<map[i].length; j++) {
                if (i != 0 && i != map.length-1) {
                    fringeVals[0] = map[i-1][j].elev;
                    fringeVals[2] = map[i+1][j].elev;
                }
                if (j != 0 && j != map.length-1) {
                    fringeVals[0] = map[i][j-1].elev;
                    fringeVals[2] = map[i][j+1].elev;
                }


                map[i][j].smoothElev(fringeVals);
            }
        }




    }


    @Override
    public String toString() {
        String retval = "";

        for (MapSector[] i : map) {
            for (MapSector j : i)
                retval += j + " ";
            retval += "\n";
        }

        return retval;
    }
}
