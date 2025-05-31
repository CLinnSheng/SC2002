public class Triangle extends Polygon {
    
    public Triangle(float width, float height) {
        super("Triangle", width, height);
        polytpye = KindofPolygon.POLY_TRIANG;
    }

    public float calArea() {
        return (float)0.5 * width * height;
    }
}
