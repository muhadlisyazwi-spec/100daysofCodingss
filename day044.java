
import java.util.Scanner;

public class day044 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = y.nextLine();
        System.out.print("Masukkan nilai: ");
        int nilai = y.nextInt();
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        if(nilai <=100 && nilai >=85){
            System.out.println("Predikat Nilai : A");
            }else if (nilai <= 84 && nilai >=75){
            System.out.println("Predikat Nilai : B");
            }else if (nilai <= 74 && nilai >=65){
            System.out.println("Predikat Nilai : C");
            }else if (nilai <= 64 && nilai >=50){
            System.out.println("Predikat Nilai : D");
            }else if (nilai <= 49 && nilai >=0){
            System.out.println("Predikat Nilai : E");
            }else System.out.println("Nilai tidak valid");
                if (nilai >=0 && nilai <= 100)
                    if(nilai >= 60){
                    System.out.println("Status = Lulus");
                    }else System.out.println("Status = Tidak Lulus");

    }
}
