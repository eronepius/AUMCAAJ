import static java.lang.Math.*;
import java.util.Scanner;

abstract class Shape {
    abstract void RectangleArea(double lenght, double width);

    abstract void SquareArea(double side);

    abstract void CircleArea(double radius);
}

class Area extends Shape {

    @Override
    public void RectangleArea(double lenght, double width) {
        System.out.printf("Rectangle area = %.2f", lenght * width);
        System.out.println("");
    }

    @Override
    public void SquareArea(double side) {
        System.out.printf("Square area = %.2f", pow(side, 2));
        System.out.println("");
    }

    @Override
    public void CircleArea(double radius) {
        System.out.printf("Circle area = %.2f", PI * pow(radius, 2));
        System.out.println("");
    }
}

class Area1 {
    public static void main(String[] args) {

        Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length for rectangle: ");
        double len = in.nextDouble();
        System.out.print("Enter breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Enter breadth for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Enter radius for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
    }
}
