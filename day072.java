import java.util.Scanner;

public class day072 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = 1; i < a; i++) {
            for (int k = i; k <= a; k++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+" ");
                }
            
            System.out.println();
        }
    }
}
