public class Cuboid extends Shape_3d {
   private double length;
   private double width;
   private double height;

   public Cuboid(double var1, double var3, double var5) {
      this.length = var1;
      this.width = var3;
      this.height = var5;
      this.shape_2d = new Rectangle(var5, var1);
   }

   public double get_TSA() {
      return 2.0 * (this.shape_2d.getArea() + this.height * this.width + this.length * this.width);
   }

   public String getShapeName() {
      return "Cuboid";
   }
}
