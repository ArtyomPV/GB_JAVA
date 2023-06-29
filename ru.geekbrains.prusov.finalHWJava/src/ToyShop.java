import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToyShop {
    Queue<Toy> toys;

    public ToyShop() {
        this.toys = new PriorityQueue<>();
    }
    public Queue<Toy> addToy(Toy toy){
        this.toys.add(toy);
        return this.toys;
    }

    public Queue<Toy> getToys() {
        return toys;
    }
}
