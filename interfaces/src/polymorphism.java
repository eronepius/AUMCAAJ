class Polygon {
    public void render() {
        System.out.println("Area of polygon changes with the type of polygon.");
    }
}

class Square extends Polygon {
    public int radius;

    Square(int rad) {
        this.radius = rad;
    }

    // renders Square
    public void render() {
        System.out.println("Area of Square is : " + (this.radius * this.radius));
    }
}

class Circles extends Polygon {
    public int radius;

    Circles(int rad) {
        this.radius = rad;
    }

    public void render() {
        System.out.println("Area of Circle is : " + (3.14 * this.radius * this.radius));
    }
}

public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism in Java..");
        Square s1 = new Square(2);
        s1.render();
        Circles c1 = new Circles(10);
        c1.render();
    }
}