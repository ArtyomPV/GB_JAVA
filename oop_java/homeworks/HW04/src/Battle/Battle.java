package Battle;

import Warrior.Warrior;

import java.util.Random;

public class Battle {
    private Warrior firstPlayer;
    private Warrior secondPlayer;

    public Battle(Warrior firstPlayer, Warrior secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Warrior fight() {
        System.out.println(String.format("\tЗдоровье %s:  %s", firstPlayer.getName(), firstPlayer.getHp()));
        System.out.println(String.format("\tЗдоровье %s:  %s", secondPlayer.getName(), secondPlayer.getHp()));
        while (firstPlayer.getHp() > 0 && secondPlayer.getHp() > 0) {
            playerAttack(firstPlayer, secondPlayer);

            if (secondPlayer.getHp() <= 0) {
                return firstPlayer;
            }
            playerAttack(secondPlayer, firstPlayer);
            if (firstPlayer.getHp() <= 0) {
                return secondPlayer;
            }
        }
        return secondPlayer;
    }
    private void  playerAttack(Warrior first, Warrior second){
        int attack;
        attack = first.Attack();
        System.out.println(String.format("%s нанес удар такой силы %s", first.getName(), attack));
        attack = attack - second.useDefense();
        if (attack < 0) {
            attack = 0;
        }
        System.out.println(String.format("\t%s применил защиту, урон от атаки составил - %d", second.getName(), attack));
        second.setHp(second.getHp() - attack);
        if (second.getHp() <= 0) {
            System.out.println(String.format("\t\t%s погиб", second.getName()));
        } else {
            System.out.println(String.format("\t\tЗдоровье %s:  %s", second.getName(), second.getHp()));
        }
    }

}
