public class Sphere extends Shape_3d {
   private double radius;

   public Sphere(double var1) {
      this.radius = var1;
      this.shape_2d = new Circle(var1);
   }

   public double get_TSA() {
      return 4.0 * this.shape_2d.getArea();
   }

   public String getShapeName() {
      return "Sphere";
   }
}
