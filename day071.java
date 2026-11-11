import java.util.Scanner;

public class day071 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int k = i; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
