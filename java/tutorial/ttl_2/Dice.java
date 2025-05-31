import java.util.*;

public class Dice {
    
    private int valueOfDice;
    private static Random rand;
    
    public Dice() {
        valueOfDice = 0;
        rand = new Random();
    }
    public void setDiceValue() {
        valueOfDice = rand.nextInt(6) + 1;
    }
    public int getDiceValue() {
        return valueOfDice;
    }
    public void printDiceValue() {
        System.out.printf("Current Value is %d\n", getDiceValue());
    }
}
