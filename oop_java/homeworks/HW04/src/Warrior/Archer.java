package Warrior;


import Defense.WoodenShield;
import Weapon.Bow;

import java.util.Random;
public class Archer extends Warrior<Bow, WoodenShield>{
    public Archer(String name, Bow bow, WoodenShield woodenShield, int hp) {
        super(name, bow, woodenShield, hp);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
