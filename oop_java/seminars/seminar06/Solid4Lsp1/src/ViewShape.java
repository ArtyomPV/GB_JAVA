import lsp.Rectangle;
import lsp.Shape;

public class ViewShape {
    private Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea(){
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(shape.getArea());
    }
}
