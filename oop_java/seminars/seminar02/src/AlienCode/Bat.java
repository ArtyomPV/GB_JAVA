package AlienCode;

import AlienCode.Flyable;
import AlienCode.Predator;

public class Bat extends Predator implements Flyable {

    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pip-pip-pip";
    }

    @Override
    public int speedForFly() {
        return 120;
    }

}
