//import java.util.*;
//
//class Circle {
//    int radius;
//
//    Circle(int r) {
//        this.radius = r;
//    }
//
//    void getter() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radius :  ");
//        int r = sc.nextInt();
//        setter(r);
//    }
//
//    void setter(int r) {
//        this.radius = r;
//    }
//
//    double cir() {
//        double circumference = (2 * 3.14) * this.radius;
//        return circumference;
//    }
//
//    double area() {
//        double area = 3.14 * (this.radius * this.radius);
//        return area;
//    }
//
//    void tostring() {
//        System.out.print("This is a circle with radius " + this.radius);
//    }
//}
//
//class Multicircle {
//    public static void main(String[] args) {
//        Circle c = new Circle(10);
//        c.getter();
//        System.out.println("\nArea : " + c.area() + "\nCircumference : " + c.cir());
//        c.tostring();
//    }
//}