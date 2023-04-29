package myCode.Animals.Predator;


import myCode.Animals.Animal;

public abstract class Predator extends Animal {

    public Predator(String name) {
        super(name);
    }

    public String feed(){
        return "meat";
    }
}
