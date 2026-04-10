abstract class Shape {

    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    float radius;

    Circle(float r) {
        radius = r;
    }

    void calculate_area() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    float length;
    float breadth;

    Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    void calculate_area() {
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Problem7 {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}
