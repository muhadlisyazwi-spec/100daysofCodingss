import java.util.Scanner;

public class day045 {
    public static void main(String[] args) {
    Scanner y = new Scanner(System.in); 
    System.out.print("Masukkan nama dia : ");
    String nama = y.nextLine();
    System.out.println("emang "+nama+" gimana orangnya? pilih 1-3");
    int list = y.nextInt();
    
        
    switch (list) {
        case 1:
            System.out.println("dia ganteng");
            break;
        case 2:
            System.out.println("dia jelek");
            break;
        case 3:
            System.out.println("dia miskin");
            break;
        default:
            System.out.println("harus sesuai list");
    }
    }
}
