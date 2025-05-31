import java.util.Scanner;

public class P1 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a character: ");
    char ch = in.next().charAt(0);

    switch (ch) {
      case 'a':
      case 'A':
        System.out.print("Action movie fan\n");
        break;

      case 'c':
      case 'C':
        System.out.print("Comedy movie fan\n");
        break;

      case 'd':
      case 'D':
        System.out.print("Drama movie fan\n");
        break;

      default:
        System.out.print("Invalid choice\n");
    }
  }
}
