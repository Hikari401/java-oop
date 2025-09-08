import java.util.Scanner;
public class GettingInput {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);

        String name;
        int number;

        System.out.println("\tGreeting program");

        System.out.print("Enter your name ");
        name = sn.nextLine();

        System.out.print("Enter your favorite number ");
        number = sn.nextInt();

        System.out.print("Hello " + name);
        System.out.println(",your favorite number is " + number);
    }
}
