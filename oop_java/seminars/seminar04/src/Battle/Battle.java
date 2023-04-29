package Battle;

import Warrior.Warrior;

public class Battle {
    private Warrior firstPlayer;
    private Warrior secondPlayer;

    public Battle(Warrior firstPlayer, Warrior secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Warrior fight(){
        while (firstPlayer.getHp() > 0 && secondPlayer.getHp() > 0) {
            int attack = firstPlayer.Attack();
            System.out.println(String.format("Первый воин нанес удар такой силы %s", attack));
            secondPlayer.setHp(secondPlayer.getHp() - attack);
            System.out.println(String.format("Здоровье второго игрока:  %s", secondPlayer.getHp()));
            if (secondPlayer.getHp() <= 0) {
                return firstPlayer;
            }
            attack = secondPlayer.Attack();
            System.out.println(String.format("Первый воин нанес удар такой силы %s", attack));
            firstPlayer.setHp(secondPlayer.getHp() - attack);
            System.out.println(String.format("Здоровье второго игрока:  %s", firstPlayer.getHp()));


        }
        return secondPlayer;
    }
}
