import java.util.Scanner;

public class day056 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i+ " ");
        }
        
        System.out.println();
        for (int i = a; i >= 1; i--) {
            System.out.print(i+ " ");
        }
    }
}
