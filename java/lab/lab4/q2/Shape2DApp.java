import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shape2DApp {
   private static Scanner sc;
   private static List<Shape_2d> shapes;

   public static void main(String[] var0) {
      System.out.println("Welcome to Shape2dApp");
      System.out.print("Please enter the nubmer of shapes: ");
      int var1 = sc.nextInt();

      for(int var2 = 0; var2 < var1; ++var2) {
         addShape();
      }

      System.out.println("Area for all shapes");
      Iterator var4 = shapes.iterator();

      while(var4.hasNext()) {
         Shape_2d var3 = (Shape_2d)var4.next();
         System.out.printf("%s Area: %.2f\n", var3.getShapeName(), var3.getArea());
      }

   }

   public static void addShape() {
      System.out.println("Choose a Shape:\n1: Circle\n2: Rectangle\n3: Triangle\n4: Square");

      try {
         switch (sc.nextInt()) {
            case 1:
               System.out.print("Radius: ");
               shapes.add(new Circle(sc.nextDouble()));
               break;
            case 2:
               System.out.print("Length: ");
               double var0 = sc.nextDouble();
               System.out.print("Breadth: ");
               shapes.add(new Rectangle(sc.nextDouble(), var0));
               break;
            case 3:
               System.out.print("Height: ");
               double var2 = sc.nextDouble();
               System.out.print("Base: ");
               shapes.add(new Triangle(var2, sc.nextDouble()));
               break;
            case 4:
               System.out.print("Side: ");
               shapes.add(new Square(sc.nextDouble()));
               break;
            default:
               throw new Exception("Invalid Input Choice");
         }
      } catch (Exception var4) {
         System.out.println(var4);
      }

   }

   static {
      sc = new Scanner(System.in);
      shapes = new ArrayList<>();
   }
}
