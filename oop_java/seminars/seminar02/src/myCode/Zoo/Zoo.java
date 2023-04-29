package myCode.Zoo;



import myCode.Animals.Animal;
import myCode.Interfaces.Flyable;
import myCode.Interfaces.GroundMoveable;
import myCode.Interfaces.Sayable;
import myCode.Radio;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    public Zoo addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    private Radio radio;
    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public List<Sayable> getSayable(){
//        List<Sayable> sayables = new ArrayList<>();
//        for (Sayable sayable: animals){
//            sayables.add(sayable);
//        }
//        sayables.addAll(animals);
        List<Sayable> sayables = new ArrayList<>(animals);
        sayables.add(radio);
        return sayables;
    }
    public void getSay(Animal animal){
        System.out.println(animal.say());
    }
    public List<GroundMoveable> groundMoveables(){
        List<GroundMoveable> groundMoveables = new ArrayList<>();
        for (Animal animal: animals){
            if(animal instanceof GroundMoveable){
                groundMoveables.add((GroundMoveable) animal);
            }
        }
        return groundMoveables;
    }

    public List<Flyable> flyables(){
        List<Flyable> flyablesAnimal = new ArrayList<>();
        for (Animal animal:animals){
            if(animal instanceof Flyable){
                flyablesAnimal.add((Flyable) animal);
            }
        }
        return flyablesAnimal;
    }
    public GroundMoveable winner(){
        int indexWinner = 0;
        for(int i = 0; i < groundMoveables().size(); i++){
            if(groundMoveables().get(indexWinner).runSpeed() < groundMoveables().get(i).runSpeed()){
                indexWinner = i;
            }
        }
        return groundMoveables().get(indexWinner);
    }

    public Flyable flyWinner(){
        int indexWinner = 0;
        for(int i = 0; i < flyables().size(); i++){
            if(flyables().get(indexWinner).flySpeed() < flyables().get(i).flySpeed()) {
                indexWinner = i;
            }
        }
        return flyables().get(indexWinner);
    }
}
