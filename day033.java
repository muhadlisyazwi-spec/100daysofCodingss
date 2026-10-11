import java.util.Scanner;

public class day033 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("berapa uang anda");
        double uang = y.nextDouble();
        if (uang <= 1000){
            System.out.println("kasianmu"); 
        }else
        System.out.println("orang have");
    }
}
