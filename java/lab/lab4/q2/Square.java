public class Square extends Shape_2d {
   private double side;

   public Square(double var1) {
      this.side = var1;
   }

   public double getArea() {
      return Math.pow(this.side, 2.0);
   }

   public String getShapeName() {
      return "Square";
   }
}
