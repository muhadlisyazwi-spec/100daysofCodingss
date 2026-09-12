package src;

import java.util.Scanner;

public class day012 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("Namamu bang : ");
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
        input.nextLine();
        if (gender == 'L' || gender == 'l') {
            System.out.println("Halo ganteng");
        } else if (gender == 'P' || gender == 'p') {
            System.out.println("Hai cantikkk");
        } else
            System.out.println("makhluk apa kau ini?");
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
    }
}
