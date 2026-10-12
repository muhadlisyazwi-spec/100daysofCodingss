
import java.util.Scanner;

public class day041 {
    public static void main(String[] args) {
        //Menentukan temperatur ruangan
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan Suhu : ");
        int temperatur = y.nextInt();
        System.out.println("Suhu : "+ temperatur + "°");
        if (temperatur > 38){
            System.out.println("suhunya panas bro");
        }else if (temperatur >18 ) {
            System.out.println("anget mas");
        }else System.out.println("dinginn");

    }
}
