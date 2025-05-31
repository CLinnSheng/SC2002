import java.util.*;

public class Q3 {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n\n Enter number of Integer elements to be sorted: ");
        int [] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("\n\n Enter integer value ofr element no.%d : ", i + 1);
            a[i] = sc.nextInt();
        }

        bubble_sort(a, a.length);

        System.out.print("\n\n Finally sorrted array is: ");
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }

    public static void bubble_sort(int [] array, int size) {

        int i, j, t;
        
        for (i = size - 2; i >= 0; i--)
            for (j = 0; j <= i; j++)
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
    }

}
