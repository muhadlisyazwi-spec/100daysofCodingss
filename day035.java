
import java.util.Scanner;

public class day035 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Sebuah balok memiliki panjang 20 cm, lebar 23 cm, tinggi 32 cm, cari volume balok tersebut");
        int P = 20;
        int L = 23;
        int T = 32;
        boolean status = false;
        int rumus = P * L * T;
        while (!status){
            System.out.println("jawab bosku: ");
            if (y.hasNextInt()){
                int jawab = y.nextInt();
                if (jawab == rumus){
                    status = true;
                    System.out.println("betul");
                }
            }
        }
    }
}
