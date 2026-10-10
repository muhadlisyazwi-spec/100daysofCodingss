
import java.util.Scanner;

public class day039 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        double angka1,angka2,hasil = 0;
        char operator;
        boolean valid = false;
        System.out.println("Kalkulator abal abal");
        System.out.println("Masukkan angka 1 : ");
        angka1 = y.nextDouble();
        System.out.println("Masukkan operator");
        operator = y.next().charAt(0);
        System.out.println("Masukkan angka 2 : ");
        angka2 = y.nextDouble();

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;    
                break;
            case 'x':
            hasil = angka1 * angka2;    
                break;
            case '-':
            hasil = angka1 - angka2;    
                break;
            case ':':
            hasil = angka1 / angka2;
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            }else 
            System.out.println("tidak boleh dibagi dengan 0");
            valid = true;
            break;
            default:
            System.out.println("Operator tidak valid");
            valid = true;
        }
        if (!valid)
        System.out.println("Hasil : "+hasil);
    }
}
