
import java.util.Scanner;

public class day024 {
    public static void main(String[] args) throws InterruptedException{
        Scanner beb = new Scanner(System.in);
        boolean status =false;
        int panjang = 6;
        int lebar = 2;
        int rumus = panjang * lebar;
        System.out.println("========SOAL MENCARI LUAS PERSEGI PANJANG========");
        System.out.println("Diketahui sebuah persegi panjang memiliki panjang 6cm dan lebar 2cm, hitung luasnya");
        while(!status) {
            Thread.sleep(1500);
            System.out.println("Jawab:");
            if (beb.hasNextInt()) {
                int jawab = beb.nextInt();
                if (jawab == rumus) {
                    status = true;
                    System.out.println("PINTARRR");
                }else System.out.println("salah woi");
            }else System.out.println("BISA NDA SIH ANGKA SAJA?");
            beb.nextInt();
            
        }
    }
}
