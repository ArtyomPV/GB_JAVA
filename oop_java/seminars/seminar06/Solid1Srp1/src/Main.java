import srp.Draw;
import srp.Point;
import srp.Square;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        Draw draw = new Draw(10);

        draw.draw(5*2);
    }
}