import controller.Method;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(10.0);
        shapes[2] = new Rectangle(8.0, 12.0);
        shapes[3] = new Square(7.0);

        Method.callHowToColor(shapes);
    }
}
