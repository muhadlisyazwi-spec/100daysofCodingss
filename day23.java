
import java.util.Scanner;

public class day023 {
    public static void main(String[] args) {
        Scanner yaku = new Scanner(System.in);

        System.out.println("=======SOAL LATIHAN=======");
        System.out.println("Diketahui sebuah persegi memiliki panjang sisi 15cm, cari luasnya");
        int sisi = 15;
        boolean statusBenar = false;
        int rumus = sisi * sisi;
    while (!statusBenar) {
        System.out.println("jawab broku");
        if (yaku.hasNextInt()) {
        int jawab = yaku.nextInt();
            if (jawab == rumus) {
            System.out.println("mantap anjir");
            statusBenar = true;
            }else System.out.println("ulang lagi");
        }else System.out.println("angka aja mas");
    }
    }
}
