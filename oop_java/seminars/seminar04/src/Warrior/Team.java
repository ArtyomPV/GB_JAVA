package Warrior;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> warriors = new ArrayList<>();

    public Team<T> addWarrior(T warrior){
        warriors.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriorsTeam = new StringBuilder();
        for(T item: warriors){
            warriorsTeam.append(item);
            warriorsTeam.append("\n");

        }
        warriorsTeam.append("Характеристики команы:");
        warriorsTeam.append("\n");
        warriorsTeam.append(String.format("Total healths of team: %d", healthPoints()));
        warriorsTeam.append(String.format("Total demage of team: %d", getDamage()));
        warriorsTeam.append(String.format("Max range of team: %d", maxRange()));

        return warriorsTeam.toString();
    }
    public  int healthPoints(){
        int sum = 0;
        for(T warrior: warriors){
            sum += warrior.getHp();
        }
        return sum;
    }

    public  int getDamage(){
        int sum = 0;
        for(T warrior: warriors){
            sum += warrior.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for(T warrior: warriors){
            if(warrior instanceof Archer){
                if(max < ((Archer) warrior).range()){
                    max = ((Archer) warrior).range();
                }
            }
        }
        return max;
    }

}
