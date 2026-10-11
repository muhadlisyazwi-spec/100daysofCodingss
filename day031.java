
import java.util.Scanner;

public class day031 {
    public static void main(String[] args) throws InterruptedException {
        Scanner y = new Scanner(System.in);
        System.out.println("rating muka (1-100)");
        int muka = y.nextInt();
        System.out.println("Uang sekarang");
        double uang = y.nextDouble();

        boolean statusGanteng = (muka >= 75) || (uang >=10000);
        System.out.println("ganteng \t: " +statusGanteng);
        boolean statusGantengKaya = (muka >= 75) && (uang >=10000);
        System.out.println("ganteng + kaya \t: " +statusGantengKaya);
        if (!statusGanteng && !statusGantengKaya){
            Thread.sleep(1500);
            System.out.println("jelek banget hidup lu");
        }
    }
}
