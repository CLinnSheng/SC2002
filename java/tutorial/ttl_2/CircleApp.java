import java.util.*;

public class CircleApp {
    
    public static void main(String [] args) {

        ttl_2.Circle circle = null;
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==== Circle Computation ====");
        System.out.println("1. Create a new circle");
        System.out.println("2. Print area");
        System.out.println("3. Print circumference");
        System.out.println("4. Quit");
        System.out.println("=============================");

        do {

            System.out.println("Choose option (1-3):");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    circle = new    Circle(sc.nextDouble());
                    System.out.println("A new circle is created");
                    break;
                
                case 2:
                    System.out.println("Area of circle");
                    System.out.printf("Radius: %.1f\n Area: ", circle.getRadius());
                    circle.printArea();
                    
                    break;

                case 3:
                    System.out.println("Circumference of circle");
                    System.out.printf("Radius: %.1f\n Circumference: ", circle.getRadius());
                    circle.printCircumference();
                    
                    break;

                case 4:
                    System.out.println("Thank you!!");
                    break;

            }

        } while (choice != 4);
    }
}
