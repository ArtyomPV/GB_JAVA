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

       double sumArea = 0;
       for(Shape shape: shapes){
           if(shape instanceof RightTriangle){
               RightTriangle rightTriangle = (RightTriangle) shape;
               sumArea += rightTriangle.getKatet1() * rightTriangle.getKatet2() / 2;
           }
           if (shape instanceof Square){
               Square square = (Square) shape;
               sumArea += square.getSide()*square.getSide();
           }
       }
        System.out.printf("Sum of all shapes = %s", sumArea);
    }
}