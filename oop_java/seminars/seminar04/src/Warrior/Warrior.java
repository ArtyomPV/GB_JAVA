package Warrior;

import Interfaces.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon>  {
    protected String name;
    protected T weapon;
    protected int hp;

    public Warrior(String name, T weapon, int hp) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("Name %s weapon %s health %d", name, weapon, hp);
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHp() {
        return hp;
    }

    public int Attack(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}
