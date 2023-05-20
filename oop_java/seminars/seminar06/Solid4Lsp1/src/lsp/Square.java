package lsp;

public class Square extends Shape{
    private int side;
    public Square(int sideA) {
        this.side = sideA;
    }

    public int getSideA() {
        return side;
    }

    public void setSideA(int sideA) {
        this.side = sideA;
    }




    public int getArea() {
        return (int)Math.pow(getSideA(),2);
    }
}
