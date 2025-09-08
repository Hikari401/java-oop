import java.util.Scanner;
public class loop2 {
    public static void main(String[]args){
        int size = 9;
        for(int i = 1; i <= 5; i++){
            for (int j = size; j >= 1; j--) {
                for (int k = size; k >= j; k--) {
                    System.out.print(j);
                }
            }
             System.out.println();
    }
    }
    
}
