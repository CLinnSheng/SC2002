package lab3;
import java.util.*;

public class Plane {
    
    static final int NUMBER_OF_SEAT = 12;

    private PlaneSeat [] seat = new PlaneSeat[NUMBER_OF_SEAT];
    private int numEmptySeat;


    public Plane() {
        // When an object is created, the initial emptyseat will be 12
        this.numEmptySeat = NUMBER_OF_SEAT;

        for (int i = 0; i < NUMBER_OF_SEAT; i++)
            seat[i] = new PlaneSeat(i);
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (int i = 0; i < NUMBER_OF_SEAT; i++)
            if (!(seat[i].isOccupied()))
                System.out.println("SeatID " + (i + 1));
    }

    public PlaneSeat [] sortSeats() {

        // Copy of original seat array is used for sorting instead of the orginal
        // sort it according to customerID
        int [] sortCustomerID = new int[NUMBER_OF_SEAT - numEmptySeat];
        int cnt = 0;

        for (int i = 0; i < NUMBER_OF_SEAT; i++)
            if (seat[i].isOccupied())
                sortCustomerID[cnt++] = seat[i].getCustomerID();
        
        Arrays.sort(sortCustomerID);

        // Create a temp PlaneSeat that store the customer based on sorted customer id
        PlaneSeat [] tempSeat = new PlaneSeat[NUMBER_OF_SEAT];

        for (int i = 0; i < NUMBER_OF_SEAT; i++)
            tempSeat[i] = new PlaneSeat(i);

        for (int i = 0; i < sortCustomerID.length; i++)
            for (int j = 0; j < NUMBER_OF_SEAT; j++)
                if (sortCustomerID[i] == seat[j].getCustomerID()) {
                    // store the index in the customerID
                    tempSeat[j].assign(i);
                    break;
                }

        return tempSeat;
    }

    public void showAssignedSeats(boolean bySeatId) {

        // bySeatId true -> order by SeatID
        // false -> order by customerID

        System.out.println("The seat assignments are as follow:");

        if (bySeatId) {
            // by seatID
            for (int i = 0; i < NUMBER_OF_SEAT; i++)
                if (seat[i].isOccupied())
                    System.out.println("SeatID " + (seat[i].getSeatID() + 1) + " assigned to CustomerID " + seat[i].getCustomerID());           
        }
        else {
            // by customerID
            PlaneSeat [] sortedSeat_ID = sortSeats();
            for (int i = 0; i < NUMBER_OF_SEAT - numEmptySeat; i++)
                for (int j = 0; j < NUMBER_OF_SEAT; j++)
                    if (sortedSeat_ID[j].getCustomerID() == i)
                        System.out.println("SeatID " + (sortedSeat_ID[j].getSeatID() + 1) + "assigned to CustomerID " + seat[j].getCustomerID());


        }
    }
    public void assignSeat(int seatId, int cust_id) {
        if (seat[seatId - 1].isOccupied())
            System.out.println("Seat already assigned to a customer");
        else {
            seat[seatId - 1].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!");
        }
    }
    public void unAssignSeat(int seatId) {
        seat[seatId - 1].unAssign();
        numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }
}
