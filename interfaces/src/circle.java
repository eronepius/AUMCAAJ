public class circle {
    int radius = 0;
    circle(int r){
        this.radius = r;
        System.out.println("Radius Initiated r : "+ this.radius);
    }

    void setRadius(int r){
        this.radius = r;
    }

    int getRadius(){
        return this.radius;
    }

    double calculateCircumferance(){
        return 2 * 3.14 * this.radius;
    }

    double circulateArea(){
        return 3.14 * this.radius * this.radius;
    }

    String description(){
        return ("A Description of the Class").toString();
    }
}

class MultiCircle extends circle{
    MultiCircle(int r) {
        super(r);
    }

    public static void main(String arg[]){
        circle circle1 = new circle(10);
        circle1.setRadius(11);
        System.out.println("Radius of " + circle1 + " is " + circle1.getRadius());
        System.out.println("Circumference of Circle1 : "+ circle1.calculateCircumferance());
        System.out.println("Area of Circle1 :" + circle1.circulateArea());
        System.out.println("\n\n");
        circle smallCircle = new circle(3);
        System.out.println("Radius of " + smallCircle + " is " + smallCircle.getRadius());
        System.out.println("Circumference of Circle1 : "+ smallCircle.calculateCircumferance());
        System.out.println("Area of Circle1 :" + smallCircle.circulateArea());
    }
}
