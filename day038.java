import java.util.Scanner;

public class day038 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        double nasiKepalaRandom = 200000;
        double nasiKuningGorengBegadang = 39999;
        double nasiAyamMentah = 99999;
        System.out.println("Nasi kepala random\t: Rp."+nasiKepalaRandom);
        System.out.println("Nasi kuning goreng begadang\t: Rp."+nasiKuningGorengBegadang);
        System.out.println("Nasi ayam mentah\t: Rp."+ nasiAyamMentah);

        System.out.println("Mau berapa menu ?");
        int menu = y.nextInt();
        y.nextLine(); // buang sisa Enter

        String daftarMenu = "";
        int total = 0;
        int i = 1;

        while (i <= menu) {
            System.out.print("Menu ke-" + i + ", jawab bosku: ");
            String isian = y.nextLine();
            double harga = 0;

            if (isian.equalsIgnoreCase("Nasi Kepala Random")) {
                harga = nasiKepalaRandom;
            } else if (isian.equalsIgnoreCase("Nasi Kuning Goreng Begadang")) {
                harga = nasiKuningGorengBegadang;
            } else if (isian.equalsIgnoreCase("Nasi Ayam Mentah")) {
                harga = nasiAyamMentah;
            } else {
                System.out.println("Menu tidak tersedia, coba lagi bosku.");
                continue; 
            }
 
            daftarMenu += +  i + ". " + isian + " - Rp " + harga + "\n";
            total += harga;
            i++;
        }

        System.out.println("\nDaftar pesanan:");
        System.out.print(daftarMenu);
        System.out.println("Total: Rp " + total);
    }
}
