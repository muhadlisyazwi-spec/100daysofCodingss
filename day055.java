
import java.util.Scanner;

public class day055 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Batasan (a): ");
        int a = y.nextInt();
        System.out.print("dimulai dari nilai (i) : ");
        for (int i = y.nextInt(); i <= a; i++) {
            if (i <= 0){
                System.out.println(i);
                return;
            }
            if (i == 12){
                break;
            }
            if (i %3==0){
                continue;
            }
            
            System.out.println(i);
            
        }
    }
}
