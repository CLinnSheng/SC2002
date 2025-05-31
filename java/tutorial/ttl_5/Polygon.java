
public abstract class Polygon {
    
    public enum KindofPolygon {POLY_PLAIN, POLY_RECT, POLY_TRIANG};
    protected String name;
    protected float width;
    protected float height;
    protected KindofPolygon polytpye;

    public Polygon(String theName, float theWidth, float theHeight) {
        name = theName;
        width = theWidth;
        height = theHeight;
        polytpye = KindofPolygon.POLY_PLAIN;
    }

    public KindofPolygon getPolytype() {
        return polytpye;
    }

    public void setPolytpe(KindofPolygon value) {
        polytpye = value;
    }

    public String getName() {
        return name;
    }

    public abstract float calArea();

    public void printWidthHeight() {
        System.out.println("Width = " + width + " Height = " + height);
    }
}
