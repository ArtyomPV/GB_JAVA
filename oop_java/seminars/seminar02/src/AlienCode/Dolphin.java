package AlienCode;

import AlienCode.Herbivores;
import AlienCode.Swimible;

public class Dolphin extends Herbivores implements Swimible {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "I-i-i-i-i";
    }

    @Override
    public int speedSwim() {
        return 90;
    }

}
