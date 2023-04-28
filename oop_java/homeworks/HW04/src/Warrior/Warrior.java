package Warrior;

import Interfaces.Defense;
import Interfaces.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, B extends Defense>  {
    protected String name;
    protected T weapon;
    protected  B defense;
    protected int hp;

    public Warrior(String name, T weapon, B defense, int hp) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.defense = defense;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("Name %s weapon %s health %d defense %s - %s", name, weapon, hp, defense.getClass().getSimpleName(), defense.getDefense());
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

    public int getDefensePoint() {
        return defense.getPointDefence();
    }

    public int Attack(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public int useDefense(){
        Random random = new Random();
        return random.nextInt(defense.getDefense());
    }
}
