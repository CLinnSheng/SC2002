package lab3;
import java.util.*;

public class PlaneApp {
    
    public static void main (String [] Args) {
        
        Plane plane = new Plane();
        boolean repeat = true;
        int seat_id, customer_id;

        Scanner sc = new Scanner(System.in);

        System.out.printf("(1) Show number of empty seats\n" +
                          "(2) Show the list of empty seats\n" +
                          "(3) Show the list of seat assignments by seat ID\n" +
                          "(4) Show the list of seat assignments by customer ID\n" +
                          "(5) Assign a customer to a seat\n"+
                          "(6) Remove a seat assignment\n"+
                          "(7) Exit\n");

        do {
            
            System.out.print("Enter the number of your choice: ");

            switch (sc.nextInt()) {
                case 1: plane.showNumEmptySeats(); break;
                case 2: plane.showEmptySeats(); break;
                case 3: plane.showAssignedSeats(3 % 2 == 1);    break;
                case 4: plane.showAssignedSeats(4 % 2 == 1);    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.print("Please enter SeatID: ");
                    seat_id = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    customer_id = sc.nextInt();
                    plane.assignSeat(seat_id, customer_id);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    seat_id = sc.nextInt();
                    plane.unAssignSeat(seat_id);
                    break;
                case 7:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid Input!! Please try again");
            }
        } while (repeat);
    }
}
