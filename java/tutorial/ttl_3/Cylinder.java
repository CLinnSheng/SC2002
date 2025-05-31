public class Cylinder extends Circle{

    private double height;

    public Cylinder(double height, double radius, int x, int y) {
        // TAKE NOTE: CONSTRUCTOR CALL OF BASE CLASS MUST BE THE FIRST STATEMENT IN THE CONSTRUCTOR CALL OF SUBCLASS
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return super.toString() + "\nHeihgt: " + height + "\n";
    }

    public double area() {
        return 2 * (super.area() + Math.PI * super.getRadius() * height);
    }

    public double volume() {
        return super.area() * height;
    }

}
