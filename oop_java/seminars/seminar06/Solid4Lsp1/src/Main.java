import lsp.Rectangle;
import lsp.Shape;
import lsp.Square;

public class Main {
    public static void main(String[] args) {

        Square rectangle = new Square(5);
        rectangle.setSideA(4);
//        rectangle.setSideB(5);
        System.out.printf("В квадрате сторона А = %d \n", rectangle.getSideA());
        ViewShape viewShape = new ViewShape(rectangle);
        viewShape.showArea();
    }
}