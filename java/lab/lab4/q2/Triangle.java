public class Triangle extends Shape_2d {
   private double height;
   private double base;

   public Triangle(double var1, double var3) {
      this.height = var1;
      this.base = var3;
   }

   public double getArea() {
      return 0.5 * this.height * this.base;
   }

   public String getShapeName() {
      return "Triangle";
   }
}
