import java.util.Scanner;
public class loop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of rows for the triangle pattern: ");
        int size = sc.nextInt();
        System.out.println("--- Here is your pattern ---");
        for (int i = 1; i <= size; size -=2) {
                for (int j = size; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
}
