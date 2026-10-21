import java.util.Scanner;

public class day050 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int nilai = y.nextInt();
        String hasil = (nilai %2==0) ? "Genap":"Ganjil";
        System.out.println(nilai+" adalah bilangan "+hasil);
    }
}
