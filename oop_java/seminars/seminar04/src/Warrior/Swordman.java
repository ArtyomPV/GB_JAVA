package Warrior;

import Weapon.Sword;

public class Swordman extends Warrior<Sword>{
    public Swordman(String name, Sword sword, int healthPoint) {
        super(name, sword, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("swordman %s", super.toString());
    }
}
