import java.util.Scanner;

public class day063 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        int pangkats = y.nextInt();
        int hasil=1;
        for (int i = 0; i <= a; i++) {
            hasil = pangkats * hasil;
            System.out.println(hasil);
        }
    }
}
