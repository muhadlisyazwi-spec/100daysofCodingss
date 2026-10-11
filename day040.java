
import java.util.Scanner;

public class evalaja {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int p = y.nextInt();
        int l = y.nextInt();
        int luas = p * l;
        int keliling = 2 * (p + l);
      

       System.out.println("luas : "+ luas);
       System.out.println("keliling : "+ keliling);

            }
}
