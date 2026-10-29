import java.util.Scanner;

public class day058 {
    public static void main(String[] args) {
        
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        for (int i = a; i >= 1; i--) {
            if (i %2!=0){
                System.out.print(i);
            }
            
        }
        System.out.println();
        for (int i = a; i >= 1; i--) {
            if(i %2==0){
                System.out.print(i);
            }
            
        }
    }
}

    

