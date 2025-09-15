import java.util.Scanner;
public class test{

        public static void main(String args[]) {
            Scanner input= new Scanner(System.in);
            System.out.println("Enter value of x");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("Value is one");
            } 
            else if (x == 2) {
                System.out.println("Value is two");
            } 
            else {
                System.out.println("Other than 1 or 2");
            }
            input.close();;
        }
    }