public class Pyramid extends Shape_3d {
   private double base;
   private double height;

   public Pyramid(double var1, double var3) {
      this.base = var1;
      this.height = var3;
      this.shape_2d = new Triangle(var3, var1);
   }

   public double get_TSA() {
      return Math.pow(this.base, 2.0) + 4.0 * this.shape_2d.getArea();
   }

   public String getShapeName() {
      return "Pyramid";
   }
}
