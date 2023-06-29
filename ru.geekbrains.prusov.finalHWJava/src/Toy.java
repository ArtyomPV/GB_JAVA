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
                ", name='" + name + '\'' +
                ", dropFrequency=" + dropFrequency +
                '}';
    }

    public Toy(String name, int dropFrequency) {
        this.id = Toy.indeficator;
        Toy.indeficator += 1;
        this.name = name;
        this.dropFrequency = dropFrequency;
    }


    @Override
    public int compareTo(Toy other) {
        return other.dropFrequency - this.dropFrequency;
    }
}
