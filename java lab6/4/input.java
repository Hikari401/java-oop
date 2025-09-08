import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x,y,z;

        System.out.print("Please input the 1st number:");
        x = sc.nextDouble() ;
        System.out.print("Please input the 2st number:");
        y = sc.nextDouble() ;
        System.out.print("Please input the 3st number:");
        z = sc.nextDouble() ;

        if (x > y && x > z) {
            System.out.print("The greatest number is "+x);
        }
        else if(y > x && y > z){
            System.out.print("The greatest number is "+y);
        } 
        else if (z > x && z > y){
            System.out.print("The greatest number is "+z);
        } 
    }
    
}
