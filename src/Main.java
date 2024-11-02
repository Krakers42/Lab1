
abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

class ShapeDescriber {
    public void describe (Shape shape){
        System.out.println("Pole kształtu: " + shape.getArea());
        System.out.println("Obwód kształtu: " + shape.getPerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Triangle triangle = new Triangle(5.0, 6.0, 7.0);
        ShapeDescriber describer = new ShapeDescriber();

        System.out.println("Prostokąt");
        describer.describe(rectangle);

        System.out.println("\nTrójkąt");
        describer.describe(triangle);
    }
}