package saver;

import Interfaces.Saveable;
import personal.model.Persister;


public class Saver implements Saveable {
    Persister persister;
    public Saver(Persister persister) {
        this.persister = persister;
    }
    @Override
    public void save() {
        persister.save();
    }
}
