
import java.util.Scanner;

public class day034 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("kamu suka durian?\t: ");
        String selera = y.nextLine();
        if (selera.toLowerCase().contains("tidak") ||
         selera.toLowerCase().contains("nda") ||
         selera.toLowerCase().contains("malas") ||
         selera.toLowerCase().contains("najis"))  {
           System.out.println("mantap kita sama");
         } else if (selera.toLowerCase().contains("lumayan")||
          selera.toLowerCase().contains("mungkin")||
          selera.toLowerCase().contains("sedikit")||
          selera.toLowerCase().contains("dikit")||
          selera.toLowerCase().contains("kayaknya")) {
            System.out.println("harus suka lah");
        }else System.out.println("mantappp");

    }
}



