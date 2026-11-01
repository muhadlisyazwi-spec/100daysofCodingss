
    import java.util.Scanner;

public class day061 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Perkalian 1 sampai: ");
        int n = y.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil*i;
            if(i==n)
                System.out.print(i);
            else
            System.out.print(i+"x");

        }
        System.out.print("="+hasil);
        System.out.println();
    }
}


