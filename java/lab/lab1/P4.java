import java.util.Scanner;

public class P4 {

    static final String even = "AA";
    static final String odd = "BB";

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Height: ");
        int height = in.nextInt();

        if (height == 0) {
            System.out.println("Error input!!");
            System.exit(0);
        }

        String ans = new String("");

        for (int i = 0; i < height; i++) {

            if (i % 2 == 0)
                ans = even + ans;
            else
                ans = odd + ans;

            System.out.println(ans);
        }
    }
}
