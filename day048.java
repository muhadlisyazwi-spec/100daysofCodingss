
import java.util.Scanner;

public class day048 {
    public static void main(String[] args) {
        Scanner yaya = new Scanner(System.in);
        int a = yaya.nextInt();
        char c = yaya.next().charAt(0);
        int b = yaya.nextInt();
        int hasil = 0;

        switch (c) {
            case '+':
                hasil =  a + b;
                System.out.println(hasil);
                break;
            case '-':
                    hasil = a - b;
                    System.out.println(hasil);
                    break;
            case 'x':
                    hasil = a * b;
                    System.out.println(hasil);
                    break;
            case ':':
                if(b != 0){
                    hasil = a / b;
                    System.out.println(hasil);
                }else System.out.println("angka 0 tidak bisa dibagi");
                    break;
                    default:
                    System.out.println("mohon masukkan operator yang benar");
                

        }


        
        }
        }


        

