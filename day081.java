import java.util.Scanner;

public class day081 {
    public static void main(String[] args) throws InterruptedException {
        Scanner y = new Scanner(System.in);
        int[]data = new int[3];
        System.out.println("pilih cara start 1-2");
        int a = y.nextInt();
        if (a == 1){
            data[0]=1;
            data[1]=2;
            data[2]=3;

        }else if (a == 2){
            data[0]=3;
            data[1]=2;
            data[2]=1;
        }else {System.out.println("pilih sesuai yang disuruh -_-");
        
    }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
            Thread.sleep(1500);
            
        }
        System.out.println();
        System.out.print("GO!");
        System.out.println();
    }
}
