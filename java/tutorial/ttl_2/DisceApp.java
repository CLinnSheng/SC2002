import java.util.*;

public class DisceApp {
    
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        int ttl = 0;

        Dice dice1 = new Dice();
        System.out.println("Press <key> to roll the first dice");
        dice1.setDiceValue();
        dice1.printDiceValue();
        ttl += dice1.getDiceValue();

        Dice dice2 = new Dice();
        System.out.println("Press <key> to roll the second dice");
        dice2.setDiceValue();
        dice2.printDiceValue();
        ttl += dice2.getDiceValue();

        System.out.printf("Your total number is: %d\n", ttl);
    }
}
