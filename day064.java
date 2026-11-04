import java.util.Scanner;

public class day064 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        int hasil = 1;
        for (int i = a; i >= 1; i--) {
            hasil=hasil*i;
        }
        System.out.println(hasil);
    }
}
