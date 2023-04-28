package Warrior;

import Defense.LargeSteelShield;
import Weapon.Sword;

public class Swordman extends Warrior<Sword, LargeSteelShield>{
    public Swordman(String name, Sword sword, LargeSteelShield largeSteelShield , int healthPoint) {
        super(name, sword,  largeSteelShield, healthPoint);
    }
    @Override
    public String toString() {
        return String.format("swordman %s", super.toString());
    }
}
