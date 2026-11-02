
import java.util.Scanner;

public class day062 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int tinggi = y.nextInt();
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi -i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
                
            }
            System.out.println();
        }
        System.out.println();
    }
}
