package Weapon;

import Interfaces.Weapon;

public class Sword implements Weapon {
    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Sword, damage %d", damage());
    }
}
