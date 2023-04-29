import Battle.Battle;
import Warrior.Archer;
import Warrior.Swordman;
import Warrior.Team;
import Warrior.Warrior;
import Weapon.Bow;
import Weapon.Sword;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<Archer>();
        archers.addWarrior(new Archer("Лучник1", new Bow(), 100 ));
        archers.addWarrior(new Archer("Лучник2", new Bow(), 100 ));

        Team<Swordman> swordmans = new Team<Swordman>();
        swordmans.addWarrior(new Swordman("Swordman1", new Sword(), 100));
        swordmans.addWarrior(new Swordman("Swordman2", new Sword(), 100));

        System.out.println(archers);
        System.out.println(swordmans);
        System.out.println("Здоровье команды лучников");
        System.out.println(archers.healthPoints());
        System.out.println("Здоровье команды мечников");
        System.out.println(swordmans.healthPoints());
        Archer firstWarrior = new Archer("Лучник1", new Bow(), 100 );
        Swordman secondWarrior = new Swordman("Swordman1", new Sword(), 100);

        Battle battle = new Battle(firstWarrior, secondWarrior);
        Warrior winner = battle.fight();
        System.out.println(winner);
    }


}
/*
Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов.
Реструктуризировать код в конечных классах семейства Warriors.
Добавить метод определения минимального щита члена команды в команде.
* Продумать, как можно сделать воина без щита.
 */