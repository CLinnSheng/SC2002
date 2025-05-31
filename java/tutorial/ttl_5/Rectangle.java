
public class Rectangle extends Polygon {
    
    public Rectangle(float width, float height) {
        super("Rectangle", width, height);
        polytpye = KindofPolygon.POLY_RECT;
    }

    public float calArea() {
        return width * height;
    }
}
