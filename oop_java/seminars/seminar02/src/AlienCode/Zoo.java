package AlienCode;


import myCode.Animals.Predator.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }
    public Zoo addList(Animal animal){
        listAnimal.add(animal);
        return this;
    }
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public List<Sayable> getSayble(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Walkable)
                walkables.add((Walkable) item);
        }
        return walkables;
    }
    public List<Flyable> flyables(){
        List<Flyable> flyables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Flyable)
                flyables.add((Flyable) item);
        }
        return flyables;
    }
    public List<Swimible> swimibles(){
        List<Swimible> swimibles = new ArrayList<>();
        for (var item:
             listAnimal) {
            if (item instanceof Swimible)
                swimibles.add((Swimible) item);
        }
        return swimibles;
    }
    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkables().size(); i++){
            if(walkables().get(i).speedForWalk() > walkables().get(index).speedForWalk())
                index = i;
        }
        return walkables().get(index);
    }
    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyables().size(); i++){
            if(flyables().get(i).speedForFly() > flyables().get(index).speedForFly())
                index = i;
        }
        return flyables().get(index);
    }
    public Swimible winnerSwim(){
        int index = 0;
        for (int i = 0; i < swimibles().size(); i++) {
            if(swimibles().get(i).speedSwim() > swimibles().get(index).speedSwim())
                index = i;
        }
        return swimibles().get(index);
    }


}
