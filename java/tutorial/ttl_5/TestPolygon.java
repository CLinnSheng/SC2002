public class TestPolygon {
    
    public static void main(String [] args) {

        Rectangle r = new Rectangle(5, 10);
        Triangle t = new Triangle(1, 3);

        // Static Binding
        printArea(t); printArea(r);

        // Dynamic Binding
        Polygon p;
        p = r;
        printArea(p);
        p = t;
        printArea(p);

    }

    // Static Binding
    // Use overloaded method
    public static void printArea(Triangle t) {
        System.out.println("Area: " + t.calArea());
    }

    public static void printArea(Rectangle r) {
        System.out.println("Area: " + r.calArea());
    }

    // Dynamic Binding (Determined during run time)
    public static void printArea(Polygon p) {
        System.out.println("Area: " + p.calArea());
    }

}
