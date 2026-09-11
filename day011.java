package src;

import java.util.Scanner;

public class day011 {
    public static void main(String[] args) throws InterruptedException {
        //jadi scanner adalah kelas data di java  yg sering dipake untuk menerima data yg diketik user menggunakan keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("ini cuma buat pengenalan");
        //Thread.sleep digunakan untuk meng delay program (udah kujelaskan sih tpi jelaskan lgi aja)
        Thread.sleep(1500);
        System.out.println("Nah jadi gini... ada 100 gak?");
        //berbeda dengan string pada biasanya, di string kita menggunakan input.nextline() agar di terminal nanti user yg mengetik dan bukan string yg menampilkan
        String pertanyaan = input.nextLine();
        //sebenarnya if else tidak wajib di scanner namun biar lengkap dan enak pake if else
        if (pertanyaan.toLowerCase().contains("gak") ||
        //toLowerCase berfungsi mengubah segala jawaban yg menggunakan kapital menjadi nonkapital agar sesuai dengan perintah contains
        //contains() berfungsi untuk mengenali di setiap keyword yang diketik oleh user dan mengikuti perintah jika ada keywordnya memenuhi
                pertanyaan.toLowerCase().contains("tidak") ||
                pertanyaan.toLowerCase().contains("sedikit") ||
                pertanyaan.toLowerCase().contains("dikit") ||
                pertanyaan.toLowerCase().contains("siapako") ||
                pertanyaan.toLowerCase().contains("malas")) {
            System.out.println("Miskin sulit susah ripuh busung lapar Rumah kardus");

        } else
            System.out.println("makasih org have");
    }
}
