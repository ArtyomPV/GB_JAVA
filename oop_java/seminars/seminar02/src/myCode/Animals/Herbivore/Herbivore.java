package myCode.Animals.Herbivore;


import myCode.Animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    public String feed(){
        return "grass.";
    }
}
