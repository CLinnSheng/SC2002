import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shape3DApp {
   private static Scanner sc;
   private static List<Shape_3d> shapes;

   public static void main(String[] var0) {
      System.out.println("Welcome to Shape3dApp");
      System.out.print("Please enter the nubmer of shapes: ");
      int var1 = sc.nextInt();

      for(int var2 = 0; var2 < var1; ++var2) {
         addShape();
      }

      System.out.println("Area for all shapes");
      Iterator var4 = shapes.iterator();

      while(var4.hasNext()) {
         Shape_3d var3 = (Shape_3d)var4.next();
         System.out.printf("%s Total Surface Area: %.2f\n", var3.getShapeName(), var3.get_TSA());
      }

   }

   public static void addShape() {
      System.out.println("Choose a Shape:\n1: Sphere\n2: Cuboid\n3: Pyramid");

      try {
         switch (sc.nextInt()) {
            case 1:
               System.out.print("Radius: ");
               shapes.add(new Sphere(sc.nextDouble()));
               break;
            case 2:
               System.out.print("Length: ");
               double var0 = sc.nextDouble();
               System.out.print("Width: ");
               double var2 = sc.nextDouble();
               System.out.print("Height: ");
               shapes.add(new Cuboid(var0, var2, sc.nextDouble()));
               break;
            case 3:
               System.out.print("Base: ");
               double var4 = sc.nextDouble();
               System.out.print("Height: ");
               shapes.add(new Pyramid(var4, sc.nextDouble()));
               break;
            default:
               throw new Exception("Invalid Input Choice");
         }
      } catch (Exception var6) {
         System.out.println(var6);
      }

   }

   static {
      sc = new Scanner(System.in);
      shapes = new ArrayList();
   }
}
