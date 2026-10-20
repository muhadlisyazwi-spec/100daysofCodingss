
import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int nilai = y.nextInt();
        String hasil = (nilai >= 18) ? "udah tua":"masih muda";
        System.out.println("Umur : "+nilai+ " itu "+hasil);
    }
}
