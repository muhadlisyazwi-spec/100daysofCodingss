
import java.util.Scanner;

public class day042 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok : ");
        double gajiPokok = y.nextDouble();
        System.out.print("Masukkan tunjangan : ");
        double tunjangan = y.nextDouble();
        double bpjs = 0.02;
        double jht = 0.01;
        double jp = 0.01;

        double gajiKotor = gajiPokok + tunjangan;
        System.out.println("Gaji kotor : Rp."+ gajiKotor);
        double gajiBersih = gajiKotor - (gajiKotor*bpjs) - (gajiKotor*jht) - (gajiKotor * jp);

        System.out.println("Gaji bersih : Rp."+gajiBersih );
    }
}
