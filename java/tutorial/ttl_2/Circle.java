public class Circle {
    
    private double radius;
    private static final double PI = 3.14159;

    public Circle () {}

    public Circle(double rad) {
        radius = rad;
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public void printArea() {
        System.out.printf("%.4f\n", area());
    }

    public void printCircumference() {
        System.out.printf("%.4f\n", circumference());
    }

}
