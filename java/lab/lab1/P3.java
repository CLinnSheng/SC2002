import java.util.Scanner;

public class P3 {

    static final double RATE = 1.82;

        public static void main(String [] args) {

            Scanner in = new Scanner(System.in);

            int [] starting = new int[3];
            int [] ending = new int[3];
            int [] increment = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("(" + (i + 1 )+ ")" + " Input");
                System.out.print("starting: ");
                starting[i] = in.nextInt();
                System.out.print("ending: ");
                ending[i] = in.nextInt();
                System.out.print("increment: ");
                increment[i] = in.nextInt();

                System.out.println();
            }

            // First table
            System.out.println("(1)starting: " + starting[0] + ", ending: " + ending[0] + ", increment: " + increment[0] + ";");
            checking(starting[0], ending[0]);
            System.out.println("US$       S$");
            System.out.println("---------------");
            for (int start = starting[0]; start <= ending[0]; start += increment[0])
                System.out.printf("%-10d%2.2f\n", start, start * RATE);

            // Second table
            System.out.println("(2)starting: " + starting[1] + ", ending: " + ending[1] + ", increment: " + increment[1] + ";");
            checking(starting[1], ending[1]);
            System.out.println("US$       S$");
            System.out.println("---------------");
            for (int start = starting[1]; start <= ending[1]; start += increment[1])
            System.out.printf("%-10d%2.2f\n", start, start * RATE);

            // First table
            System.out.println("(3)starting: " + starting[2] + ", ending: " + ending[2] + ", increment: " + increment[2] + ";");
            checking(starting[2], ending[2]);
            System.out.println("US$       S$");
            System.out.println("---------------");
            for (int start = starting[2]; start <= ending[2]; start += increment[2])
                System.out.printf("%-10d%2.2f\n", start, start * RATE);
        }

        public static void checking(int start, int end) {
            if (start > end) {
                System.out.println("Error Input!!");
                System.exit(0);
            }
        }
}
