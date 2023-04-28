import Battle.Battle;
import Defense.LargeSteelShield;
import Defense.WoodenShield;

import Warrior.Archer;
import Warrior.Swordman;
import Warrior.Team;
import Warrior.Warrior;
import Weapon.Bow;
import Weapon.Sword;



public class Main {

    public static void main(String[] args) {

        Team<Archer> archers = new Team();
        archers.addWarrior(new Archer("Лучник1", new Bow(), new WoodenShield(), 100 ));
        archers.addWarrior(new Archer("Лучник2", new Bow(), new WoodenShield(), 100 ));

        Team<Swordman> swordmans = new Team();
        swordmans.addWarrior(new Swordman("Swordman1", new Sword(), new LargeSteelShield(), 100));
        swordmans.addWarrior(new Swordman("Swordman2", new Sword(),new LargeSteelShield(), 100));

        System.out.println(archers);
        System.out.println(swordmans);
        System.out.println("\tЗдоровье команды лучников");
        System.out.println(archers.healthPoints());
        System.out.println("\tЗдоровье команды мечников");
        System.out.println(swordmans.healthPoints());

        archers.whoHasMinDefense("Archers");
        swordmans.whoHasMinDefense("Swordmans");


        Archer firstWarrior = new Archer("Лучник1", new Bow(), new WoodenShield(), 100 );
        Swordman secondWarrior = new Swordman("Swordman1", new Sword(), new LargeSteelShield(), 100);

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