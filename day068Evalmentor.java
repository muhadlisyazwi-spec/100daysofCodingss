
import java.util.Scanner;

public class evalMen {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        Boolean status = false;
        double saldo = 200000;
       while (!status){
    System.out.println("1. Cek Saldo");
    System.out.println("2. Tarik tunai");
    System.out.println("3. Keluar");
    int a = y.nextInt();
    while (a<=3){
    if (a==1){
        System.out.println("saldo anda : "+saldo);
        break;
    }else if (a==2){
        System.out.println("Masukkan nominal penarikan : ");
        int tarik = y.nextInt();
        if (tarik > saldo){
            System.out.println("Maaf,saldo anda tidak cukup");
            break;
        }else {System.out.println("Anda telah melakukan penarikan sebanyak "+tarik);
        saldo -=tarik;
        System.out.println("Saldo sekarang : "+ saldo);
        break;
    }
        
    }else if (a==3){
          System.out.println("Terima kasih telah menggunakan layanan kami");
          status = true;
          break;
    }else System.out.println("Pilihan tidak valid, silahkan coba lagi!");

       }
    }
            }
        }

