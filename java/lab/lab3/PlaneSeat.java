package lab3;

public class PlaneSeat {
    
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id) {
        seatId = seat_id;
        customerId = -1;
        assigned = false;
    }

    public int getSeatID() {return seatId;}
    public int getCustomerID() {return customerId;}
    public boolean isOccupied() {return assigned;}
    public void assign(int cust_id) {
        customerId = cust_id;
        assigned = true;
    }
    public void unAssign() {
        customerId = -1;
        assigned = false;
    }
}
