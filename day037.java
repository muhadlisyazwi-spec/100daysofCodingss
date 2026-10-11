
import java.util.Scanner;

public class day037 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int nilai = y.nextInt();
        if (nilai < 0){
            System.out.println("bilangan " + nilai + " adalah bilangan negatif");
        }else if (nilai > 0){
            System.out.println("bilangan " + nilai + " adalah bilangan positif");
        }else System.out.println("bilangan " + nilai + " adalah bilangan 0");
    }
}
