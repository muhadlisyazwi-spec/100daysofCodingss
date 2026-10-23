
import java.util.Scanner;

public class day052 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        Boolean status = false;
        System.out.println("Berapa 10 x 2?");
        while (!status){
            System.out.print("jawab sini : ");
        if(y.hasNextInt()){
            int jawab = y.nextInt();
            if (jawab == 20){
                System.out.println("jawabanmu benar bang");
                status = true;
            }else System.out.println("Salah kocak");
         }else System.out.println("Angka aja bang");
         y.next();
        }
    }
}
