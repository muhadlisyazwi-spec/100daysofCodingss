import java.util.Scanner;

public class day067 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
