
import java.util.Scanner;

public class day025 {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        System.out.println("========SOAL MENCARI LUAS========");
        System.out.println("Diketahui sebuah lingkaran memiliki jari jari 17 cm, hitung luas lingkaran");
        boolean status = false;
        final double pi = 3.14;
        int jariJari = 17;
        double rumus = pi*jariJari*jariJari;

        while(!status) {
            System.out.println("Jawab dong:");
            if (syg.hasNextDouble()) {
                double jawab = syg.nextDouble();
                if (jawab == rumus) {
                    status = true;
                    System.out.println("pintarnya ini orang");
                } else System.out.println("Salah anu");
            }else System.out.println("angka saja");
            syg.nextLine();
        }

    }
}
