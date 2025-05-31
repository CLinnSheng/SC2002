public class FinallyDemo {

    public static void main(String[] args) {
        
        try {
            sampleMethod(0);
        }
        catch(Exception e) {
            System.out.println("Caught in main.");
        }
    }

    public static void sampleMethod(int n) throws NegativeNumberException, Exception {
        
        try {
            if (n > 0)
                throw new Exception( );
            else if (n < 0)
                throw new NegativeNumberException( );
            else
                System.out.println("No Exception.");
            System.out.println("Still in sampleMethod.");
        }
        catch(NegativeNumberException e) {
            System.out.println("Caught in sampleMethod.");
        }

        finally {
            System.out.println("In finally block.");
        }

        System.out.println("After finally block.");
    }
}

// 99: 
// In finally block
// Caught in main
// "After finally block" is not executed because the exception is not caught in the catch block so have to go back to the main function


// -99: 
// Caught in sampleMethod
// In finally block
// After finally block

// 0:
// No Exception.
// Still in sampleMethod
// In finally block
// After finally block