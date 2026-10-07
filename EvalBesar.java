//soal 1
import java.util.Scanner;

public class evalBesar {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.print("Masukkan Nama \t\t: ");
        String nama = h.nextLine();
        System.out.print("Masukkan NIM \t\t: ");
        String NIM = h.nextLine();
        System.out.print("Masukkan Kelas \t\t: ");
        char kelas = h.next().charAt(0);
        System.out.print("Masukkan Umur \t\t: ");
        int umur = h.nextInt();
        h.nextLine();
        System.out.print("Masukkan Prodi \t\t: ");
        String prodi = h.nextLine();
        System.out.print("Status keaktifan \t: ");
        boolean status = h.nextBoolean();

        System.out.println("=====BIODATA MAHASISWA=====");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("NIM \t\t: " + NIM);
        System.out.println("Kelas \t\t: " + kelas);
        System.out.println("Umur \t\t: " + umur);
        System.out.println("Prodi \t\t: " + prodi);
        System.out.println("Status aktif\t: " + status);
        System.out.println("==================");
       
    }
}
