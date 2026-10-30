import java.util.Scanner;

public class day059 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Mencari kelipatan berapa:");
        int M = y.nextInt();
        System.out.print("Sampai batas berapa:");
        int N = y.nextInt();
        for (int i = 1; i <= N; i++) {
            int kelipatan = M *i;
            System.out.print(kelipatan + " ");
            
        }
        System.out.println();

    }
}
