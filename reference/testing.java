
public class testing {
    
    public static void main(String [] args) {

        parent p = new child();
        p.print();

        // it search function from the type of variable not the instance
        // p.special_print();
    }
}
