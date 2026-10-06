
import java.util.Scanner;

public class day021 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Nilai Ujian :");
        String nilai = y.nextLine();
        System.out.print("Status lulus :");
        String status = y.nextLine();

        double nilai2 = Double.parseDouble(nilai);
        boolean status2 = Boolean.parseBoolean(status);

        System.out.println(nilai2);
        System.out.println(status2);
    }
}
