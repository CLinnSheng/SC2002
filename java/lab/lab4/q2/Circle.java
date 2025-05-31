

public class Circle extends Shape_2d {
   private double radius;

   public Circle(double var1) {
      this.radius = var1;
   }

   public double getArea() {
      return Math.PI * Math.pow(this.radius, 2.0);
   }

   public String getShapeName() {
      return "Circle";
   }
}
