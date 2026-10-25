import java.util.Scanner;
public class evalBesar2 {
    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        int x = ya.nextInt();
        int y = ya.nextInt();
        int z = ya.nextInt();
        if (y > x){
            x +=1;
        }else if (y < x){
            x -=1;
        }
        if(z > x){
            x +=2;
        }else if(z < x){
            x -=2;
        }
        System.out.println(x);
    }
    
    
}


