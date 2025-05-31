import java.util.*;

public class test_static_app {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        
        test_static test = new test_static(a, b);
        System.out.println(test.get_ttl());

        print();
        sc.close();
    }

    public static void print()
    {
        System.out.println("testing");
    }
}
