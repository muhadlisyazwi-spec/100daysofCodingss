
import java.util.Scanner;

public class day030 {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("Masukan nilai 1");
        int a = h.nextInt();
        System.out.println("Masukan nilai 2");
        int b = h.nextInt();

        boolean status = (a>=b);
        boolean status2 = (a<=b);

        System.out.println(status);
        System.out.println(status2);
    }
}
