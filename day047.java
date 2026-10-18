
import java.util.Scanner;

public class day047 {

    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Masukkan hari: ");
        String hari = y.nextLine();
        switch (hari.toLowerCase()) {
            case "senin", "selasa", "rabu", "kamis", "jumat":
                System.out.println("Hari " + hari + " adalah hari kampus");
                break;
            case "sabtu", "minggu":
                System.out.println("hari libur/tidur");
                break;
            default:
                System.out.println("hari ape tu oi");
        }
    }
}
