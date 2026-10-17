
import java.util.Scanner;

public class day046 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("====Daftar Menu====");
        System.out.println("1. Nasi Goreng\n2. Mie Ayam\n3. Bakso\n4. Sate\n5. Ayam Geprek");
        System.out.print("Masukkan pilihan: ");
        int pilih = y.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Nama menu: Nasi Goreng\nHarga: Rp15.000");
                break;
            case 2:
                System.out.println("Nama menu: Mie Ayam\nHarga: Rp18.000");
                break;
            case 3:
                System.out.println("Nama menu: Bakso\nHarga: Rp12.000");
                break;
            case 4:
                System.out.println("Nama menu: Sate\nHarga: Rp16.000");
                break;
            case 5:
                System.out.println("Nama menu: Ayam Geprek\nHarga: Rp10.000");
                break;
           
            default:
                System.out.println("Menu Tidak Tersedia");
        }

    }
}
