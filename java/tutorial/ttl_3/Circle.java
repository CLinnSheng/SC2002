
public class Circle extends Point {
    
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\n";
    }
}
