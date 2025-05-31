import java.util.Scanner;

public class P2 {
    
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Salary: $");
        int salary = in.nextInt();

        System.out.print("Enter merit points: ");
        int merit = in.nextInt();

        char grade = determineGrade(salary, merit);
        
        System.out.printf("Salary: $%d, Merit: %d, Grade: %c\n", salary, merit, grade);

    }

    public static char determineGrade(int salary, int merit) {
        
        if (salary >= 700 && salary <= 899)
            if (salary < 800)
                return merit < 20? 'B' : 'A';
            else
                return 'A';
        else if (salary >= 600 && salary <= 799)
            if (salary < 650)
                return merit < 10? 'C' : 'B';
            else
                return 'B';
        else
            return 'C';
    }
}
