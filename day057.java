import java.util.Scanner;

public class day057 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i %2==0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= a; i++) {
            if(i %2!=0){
                continue;
            }
            System.out.print(i);
        }
    }
}
