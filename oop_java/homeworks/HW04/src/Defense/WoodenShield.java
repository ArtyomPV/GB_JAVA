package Defense;

import Interfaces.Defense;

import java.util.Random;

public class WoodenShield implements Defense {
    Random random = new Random();
    private int pointDefence = random.nextInt(7, 15);
    @Override
    public int getDefense() {

        return pointDefence;
    }
    public int getPointDefence() {
        return pointDefence;
    }

    @Override
    public String toString() {
        return String.format("%s",this.getClass().getSimpleName() );
    }
}
