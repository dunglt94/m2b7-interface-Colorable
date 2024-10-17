package controller;

import shape.Shape;
import shape.Circle;
import shape.Rectangle;
import shape.Square;


public class Method {
    public static void printShape(Shape[] shape) {
        for (Shape s : shape) {
            System.out.println(s);
        }
    }

    public static void callHowToColor(Shape[] shape) {
        for (Shape s : shape) {
            System.out.println( s + ", has area = " + s.getArea());
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }
            System.out.println();
        }
    }
}
