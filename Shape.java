class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 6;
    double width = 4;
    double area() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base = 4;
    double height = 5;

    double area() {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {

        Shape s;
        s = new Circle();
        System.out.println("Circle Area: " + s.area());
        s = new Rectangle();
        System.out.println("Rectangle Area: " + s.area());
        s = new Triangle();
        System.out.println("Triangle Area: " + s.area());
    }
}