package myCode.Animals.Herbivore;


import myCode.Interfaces.GroundMoveable;

public class Hare extends Herbivore implements GroundMoveable {
        int speedWalk = 2;
        int speedRun = 45;
        public Hare(String name) {
                super(name);
        }

        @Override
        public String toString() {
                return (String)("Hare " + super.toString());
        }

        public String say(){
        return "Frrrr";
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
