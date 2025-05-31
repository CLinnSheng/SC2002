public class Rectangle extends Shape_2d {
   private double height;
   private double length;

   public Rectangle(double var1, double var3) {
      this.height = var1;
      this.length = var3;
   }

   public double getArea() {
      return this.height * this.length;
   }

   public String getShapeName() {
      return "Rectangle";
   }
}
