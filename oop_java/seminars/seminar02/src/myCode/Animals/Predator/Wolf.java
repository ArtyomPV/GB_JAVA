package myCode.Animals.Predator;


import myCode.Interfaces.GroundMoveable;

public class Wolf extends Predator implements GroundMoveable {

    int speedWalk = 7;
    int speedRun = 50;

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Wooo";
    }

    @Override
    public String toString() {
        return String.format("Wolf " + super.toString());
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
