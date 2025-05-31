import java.util.*;

public class VendingMachine {
    
    private double ttl_money;
    private Scanner sc;

    public VendingMachine() {
        ttl_money = 0;
        sc = new Scanner(System.in);
    }

    public double selectDrink() {

        System.out.println("===== Vending Machine =====");
        System.out.println("|1. Buy Beer ($3.00)      |");
        System.out.println("|2. Buy Coke ($1.00)      |");
        System.out.println("|3. Buy Green Tea ($5.00) |");
        System.out.println("===========================");
        System.out.println("Please enter selection:");
        
        switch (sc.nextInt()) {
            case 1: return 3.0;
            case 2: return 1.0;
            case 3: return 5.0;
        }

        return 0;
    }

    public double insertCoins(double drinkCost) {

        System.out.println("Please insert coins:");
        System.out.println("=========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input    |");
        System.out.println("|Enter 'T' for twenty cents input |");
        System.out.println("|Enter 'F' for fifty cents input  |");
        System.out.println("|Enter 'N' for a dollar input     |");
        System.out.println("===================================");

        while (ttl_money < drinkCost) {
            
            char ch = sc.next().charAt(0);

            switch (ch) {
                case 'Q':
                    ttl_money += 0.10;
                    break;

                case 'T':
                    ttl_money += 0.20;
                    break;

                case 'F':
                    ttl_money += 0.50;
                    break;

                case 'N':
                    ttl_money += 1.00;
                    break;

            }

            System.out.printf("Coins inserted: %.2f\n", ttl_money);
        }
        return ttl_money;
    }

    public void checkChange(double amount, double drinkCost) {
        System.out.printf("Change: $ %.2f\n", (amount - drinkCost));
    }

    public void printReceipt() {
        System.out.println("Please collect your drink\nThank You!!");
    }
}
