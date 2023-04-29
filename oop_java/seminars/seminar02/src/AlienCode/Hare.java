package AlienCode;

import AlienCode.Herbivores;
import AlienCode.Walkable;

public class Hare extends Herbivores implements Walkable {
    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pipipi";
    }

    @Override
    public String toString() {
        return String.format("Hare, %s", super.toString());
    }

    @Override
    public int speedForWalk() {
        return 25;
    }
}
