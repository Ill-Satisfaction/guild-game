public class MapSector {
    private enum Biome {HILLS, DESERT, SNOW, PLAINS};
    public int elev;
    private Biome sectorBase;

    public MapSector(int elevation, int soilType, int waterLevel) {
        elev = elevation;
    }


    public String toString () {
        //return sectorBase.toString();
        switch (elev) {
            case 0 :
                return " ";
            case 1 :
            case 2 :
                return ".";
            case 3 :
                return "-";
            case 4 :
                return "^";
            default:
                return "#";
        }
        //return elev + "";

    }

    public void smoothElev (int[] fringe) {
        //elev *= fringe.length;
        for (int i : fringe)
            elev += i;
        elev /= fringe.length;
    }


}
