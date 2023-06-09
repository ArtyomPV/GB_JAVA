import ocp.Rectangle;
import ocp.RightTriangle;
import ocp.Shape;
import ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Shape> shapes = new ArrayList<>();
       shapes.add(new RightTriangle(3, 4));
       shapes.add(new Square(4));
       shapes.add(new Rectangle(2, 4));

       double sumArea = 0;
       for(Shape shape: shapes){
           sumArea += shape.getArea();
       }
        System.out.printf("Sum of all shapes = %s", sumArea);
    }
}