package myCode.Animals.Herbivore;


import myCode.Interfaces.Flyable;
import myCode.Interfaces.GroundMoveable;

public class Duck extends Herbivore implements Flyable, GroundMoveable {
    public Duck(String name) {
        super(name);
    }

    int speedWalk = 3;
    int speedRun = 0;
    int speedFly = 50;

    @Override
    public String toString() {
        return (String)("Duck " + super.toString());
    }

    @Override
    public String say() {
         return "Ckryak-ckryack";
    }

    @Override
    public int flySpeed() {
        return this.speedFly;
    }

    @Override
    public int walkSpeed() {
        return this.speedWalk;
    }

    @Override
    public int runSpeed() {
        return this.speedRun;
    }
}
