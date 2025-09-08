import java.util.Scanner;
public class GettingInput2 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);

        System.out.print("Please enter the width of the rectangle (cm.): ");
        double x = num.nextDouble();

        System.out.print("Please enter the height of the rectangle (cm.): ");
        double y = num.nextDouble();

        System.out.println("The area of the rectangle is " + x * y);
    }
}
