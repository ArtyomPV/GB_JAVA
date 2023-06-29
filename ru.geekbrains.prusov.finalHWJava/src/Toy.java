public class Toy implements Comparable<Toy> {
    private static int indeficator;
    private int id;
    private String name;
    private int dropFrequency;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(int dropFrequency) {
        this.dropFrequency = dropFrequency;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ",\t name='" + name + '\'' +
                ",\t dropFrequency=" + dropFrequency +
                '}';
    }

    public Toy(String name, int dropFrequency) {
        Toy.indeficator += 1;
        this.id = Toy.indeficator;
        this.name = name;
        this.dropFrequency = dropFrequency;
    }


    @Override
    public int compareTo(Toy other) {
        return other.dropFrequency - this.dropFrequency;
    }
}
