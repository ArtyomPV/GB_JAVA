package Defense;

import Interfaces.Defense;

import java.util.Random;

public class LargeSteelShield implements Defense {
    Random random = new Random();
    private int pointDefence = random.nextInt(10, 20);
    @Override
    public int getDefense() {

        return pointDefence;
    }
    @Override
    public int getPointDefence() {
        return pointDefence;
    }

    @Override
    public String toString() {
        return String.format("%s",this.getClass().getSimpleName() );
    }
}


