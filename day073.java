import java.util.Scanner;

public class day073 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("Selamat datang di menu biodata");
            System.out.println("Silahkan pilih menu (1-3)");
            System.out.println("1.Nama");
            System.out.println("2.Umur");
            System.out.println("3.Tinggi");
            System.out.println("4.keluar");
            pilih = y.nextInt();
            
            if (pilih ==1){
                System.out.println("Adli diandra");
                return;
            }else if (pilih==2){
                System.out.println("18 tahun");
                return;
            }else if (pilih==3){
                System.out.println("178 cm");
                return;
            }
        
        }while(pilih >4);
        System.out.println("Terimakasih telah menggunakan");
    }
}
