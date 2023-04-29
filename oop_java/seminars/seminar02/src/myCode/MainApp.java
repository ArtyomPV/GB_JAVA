package myCode;


import myCode.Animals.Animal;
import myCode.Animals.Herbivore.Duck;
import myCode.Animals.Herbivore.Hare;
import myCode.Animals.Predator.Eagle;
import myCode.Animals.Predator.Wolf;
import myCode.Interfaces.Flyable;
import myCode.Interfaces.GroundMoveable;
import myCode.Interfaces.Sayable;
import myCode.Zoo.Zoo;

public class MainApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Wolf("Wolf"))
                .addAnimal(new Hare("Rabbit"));

        for(Object o: zoo.getAnimals()){
            System.out.println(o);
        }


        for(Animal animal: zoo.getAnimals()){
            System.out.println(animal.getName() + '-' + animal.say());
        }
        zoo.setRadio(new Radio("FM"));
        for(Sayable sayable: zoo.getSayable()){
            System.out.println(sayable.say());
        }
        zoo.addAnimal(new Duck("Donald"));
//        System.out.println(zoo.getSay(zoo.getAnimals().get(2)));
        System.out.println(zoo.getAnimals().get(2).say());
        System.out.println("Животные которые передвигаются по земле:");
        for(GroundMoveable animal: zoo.groundMoveables()){
            System.out.printf("\t%s\n",animal.toString());
        }
        zoo.addAnimal(new Eagle("Eagle"));

        System.out.println("Животные которые могут летать:");
        for(Flyable animal: zoo.flyables()){
            System.out.printf("\t%s скорость: %d\n", animal.toString(), animal.flySpeed());
        }

        System.out.println("Победитель по бегу:");
        System.out.printf("\t%s speed %s\n", zoo.winner(), zoo.winner().runSpeed());

        System.out.println("Победитель по перелетам:");
        System.out.printf("\t%s speed %s\n", zoo.flyWinner(), zoo.flyWinner().flySpeed());


    }




}
/*
Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее.
Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки издают и тд),
а наследники собственные параметры (тип перемещения). Можно сделать дополнительную абстракцию, хищники и травоядные
 */