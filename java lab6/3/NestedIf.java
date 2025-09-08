import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.print("Do you have a car driving license? (true or false):");
        boolean hasLicense = sc.nextBoolean();

        System.out.println("=== Driving Permission Check ===");
        if (age >= 18){
            System.out.println("Age is 18 or older");
            if(hasLicense){
                System.out.println("Has driver's license");
                System.out.println("Can drive!!!");
            }
            else{
                System.out.println("No driver's license");
                System.out.println("Cannot driver!!!");
            }
        }
        else{
            System.out.println("Too young to dive");
        }
    }
}
