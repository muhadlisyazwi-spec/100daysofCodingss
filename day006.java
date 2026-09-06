package src;

import java.util.Scanner;

public class day006 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        //Char atau Character adalah tipe data yang hanya menyimpan satu karakter saja agar efisien dan hemat memori, char memiliki ukuran memori 2 byte (16-bit) dan char wajib menggunakan ('')
        //Boolean adalah tipe data yang mengungkap kebenaran dengan menggunakan true(jika benar) dan false(jika tidak benar), boolean memiliki ukuran memori yg hemat (1 bit logika)
        char Cowo = 'L';
        char Cewe = 'P';

        System.out.print("Namamu : ");
        String nama = input.nextLine();
        if (nama.toLowerCase().contains("jelek")) {
            System.out.println("emang jelek");
        } else if (nama.toLowerCase().contains("adli")) {
            System.out.println("HAH?!! SI RAJA IBLIS?!!");
        } else
            System.out.println("hm, nda terkenal skip");
        Thread.sleep(2000);
        System.out.print("Gender L/P? : ");
        char gender = input.next().charAt(0);
        if (gender == 'L' || gender == 'l') {
            System.out.println("Halo ganteng");
        } else if (gender == 'P' || gender == 'p') {
            System.out.println("Hai cantikkk");
        } else
            System.out.println("waria kau ini?");
        Thread.sleep(2000);

        System.out.print("Umur? :");
        int umur = input.nextInt();
        input.nextLine();
        if (umur >= 18) {
            System.out.println("Tua lu");
        } else
            System.out.println("hm muda");
        Thread.sleep(2000);

        System.out.print("Ada cewek? : ");
        String cewek = input.nextLine();
        if (cewek.toLowerCase().contains("tidak ") ||
                cewek.toLowerCase().contains("gak ") ||
                cewek.toLowerCase().contains("nda ")) {
            System.out.println("makanya bagusin tuh muka");
        } else if (cewek.toLowerCase().contains("otw")) {
            System.out.println("HALAH PASTI GAGAL DAPETIN DIA");
        } else
            System.out.println("semoga langgeng ya");
        Thread.sleep(5000);
        System.out.println("okelah, kita main kuis cepat yuk");
        String kuis = input.nextLine();
        if (kuis.toLowerCase().contains("nggak") ||
                kuis.toLowerCase().contains("tidak") ||
                kuis.toLowerCase().contains("malas")) {
            System.out.println("Yaudah bye");
        } else
            System.out.println("GASKANNN");
        Thread.sleep(4000);
        int hasil = 67;
        System.out.println("we berapa 60+7");
        if (input.hasNextInt()) {
            int jawab = input.nextInt();
            Boolean hasilnya = (jawab == hasil);
            if (hasilnya) {
                System.out.println("pintar monyetku! btw ketawa dong soalnya 67!");
            } else {
                System.out.println("jammiko lanjut kuliah deh");
            }
        } else {
            System.out.println("angka saja woi");
        }
    }

}
