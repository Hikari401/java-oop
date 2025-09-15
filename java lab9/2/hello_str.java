import java.util.Scanner;
public class hello_str {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter your string:");
        String aInput = sn.nextLine();
        int a = aInput.length();
        System.out.print("Output :");
        for(int i=1; i <= a;i+=2){
            System.out.print(aInput.charAt(i-1)+" ");
        }
        sn.close();
    }  
}
