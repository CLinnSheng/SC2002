import java.util.Scanner;

public class Lab2p1 {

    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {

        int choice;
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: mulTest();  break;
                case 2: 
                    System.out.printf("%d/%d = %d\n", 4, 7, divide(4, 7));   
                    System.out.printf("%d/%d = %d\n", 7, 7, divide(7, 7));   
                    System.out.printf("%d/%d = %d\n", 25, 7, divide(25, 7));   
                    break;
                case 3: 
                    System.out.printf("%d%%%d = %d\n", 4, 7, modulus(4, 7));   
                    System.out.printf("%d%%%d = %d\n", 7, 7, modulus(7, 7));   
                    System.out.printf("%d%%%d = %d\n", 25, 7, modulus(25, 7));   
                    break;
                case 4: 
                    System.out.println("n: " + -12 + ((countDigits(-12) == 0)? " Error Input" : (" count = " + countDigits(12))));
                    System.out.println("n: " + 123 + ((countDigits(123) == 0)? " Error Input" : (" count = " + countDigits(123))));
                    System.out.println("n: " + 121456 + ((countDigits(121456) == 0)? " Error Input" : (" count = " + countDigits(123456))));
                    break;
                case 5: 
                    System.out.println("position = " + position(12345, 3));
                    System.out.println("position = " + position(123, 4));
                    System.out.println("position = " + position(12145, 1));
                    break;
                case 6:
                    System.out.println("OddDigits = " + ((extractOddDigits(12345) == 0)? "Error Input" : extractOddDigits(12345)));
                    System.out.println("OddDigits = "+ ((extractOddDigits(54123) == 0)? "Error Input" : extractOddDigits(54123)));
                    System.out.println("OddDigits = " + ((extractOddDigits(246) == 0)? "Error Input" : extractOddDigits(246)));
                    System.out.println("OddDigits = " + ((extractOddDigits(-12) == 0)? "Error Input" : extractOddDigits(-12)));
                break;

                case 7: System.out.println("Program terminating....");
            }
        } while (choice < 7);

    }

    public static void mulTest() {

        int correct = 0;

        for (int i = 0; i < 5; i++) {
            int n1 = (int)(Math.random() * 10);
            int n2 = (int)(Math.random() * 10);
            
            System.out.printf("How much is %d times %d?", n1, n2);
            int answer = sc.nextInt();

            if (answer == n1 * n2)
                correct++;

        }

        System.out.printf("%d out of 5 are correct", correct);
    }

    public static int divide(int m, int n) {
        
        int ans = 0;

        while (m > 0) {
            m -= n;
            if (m < 0)  break;
            ans++;
        }

        return ans;
    }
    public static int modulus(int m, int n) {

        if (m == n) return 0;
        
        while (m > 0)
            m -= n;

        return Math.abs(m) + 1;
    }
    
    public static int countDigits(int n) {

        String str = Integer.toString(n);

        return (str.charAt(0) != '-') ? str.length() : 0;
    }

    public static int position (int n, int digit) {

        int cnt = 1;

        while (n > 10) {
            int temp = n % 10;
            if (temp == digit)
                return cnt;
            n /= 10;
            cnt++;
        }

        return -1;
    }

    public static long extractOddDigits (long n) {

        if (n < 0)
            return 0;

        long ans = 0;
        int cnt = 0;

        while (n > 0) {
            int temp = (int) (n % 10);

            if (temp % 2 == 1) {
                ans += temp * Math.pow(10, cnt);
                cnt++;
            }
            n /= 10;
        }

        return (ans == 0)? -1 : ans;
    }
}