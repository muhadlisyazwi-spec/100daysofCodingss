import java.util.Scanner;

public class day086 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int []a = {3,5,4};
        int target = y.nextInt();
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==target){
                index=i;
                break;
            }
            
        }
        if (index!=target){
            System.out.println(index);
        }else System.out.println("angka tersebut tidak dalam elemen manapun");
    }
}
