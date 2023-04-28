package Interfaces;
import Warrior.Warrior;
import java.util.Comparator;

public class SortByDefensePoint implements Comparator<Warrior> {
    @Override
    public int compare(Warrior warrior1, Warrior warrior2) {
        if(warrior1.getDefensePoint() < warrior2.getDefensePoint()){
            return -1;
        }
        if(warrior1.getDefensePoint() == warrior2.getDefensePoint()){
            return 0;
        }
            return 1;

    }
}
