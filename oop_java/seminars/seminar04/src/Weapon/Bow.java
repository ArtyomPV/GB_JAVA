package Weapon;

import Interfaces.Weapon;

import java.util.Random;

public class Bow implements Weapon {
    public int distanse = 50;
    @Override
    public int damage() {
        return 20;
    }

    public int getDistanse() {
        return distanse;
    }

    public int range(){
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow,  damage %d, distance %d", damage(), getDistanse());
    }
}
