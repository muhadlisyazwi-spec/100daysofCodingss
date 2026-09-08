package src;

public class day008 {
    public static void main(String[] args) throws InterruptedException {
        //Deklarasi adalah proses memperkenalkan/mendaftarkan nama variabel dan nilainya ke java, contohnya nama variabel nilai1 didaftar ke int yg artinya nilainya bilangan bulat
        //Inisialisasi adalah proses pemberi nilai pertama kepada variabel yg sudah terdaftar, contohnya nilai1 diberi nilai 1287309
        int nilai1 = 1287309;
        int nilai2 = 8273;
        //Update variabel adalah hasil perubahan dari nilai pertama ke nilai yg baru dengan menimpa nilai lama, contohnya 1287309(Nilai1) x 8273(Nilai2) = 2059972765 (nah inilah update variabelnya)
        int hasil = (nilai1 * nilai2);

        System.out.println("1287309 x 8273 = " + hasil);
        Thread.sleep(2000);
        System.out.println("Hasilnya banyak dan bisa diukur oleh java");
        Thread.sleep(2000);
        System.out.println("Namun cintaku padamu tak bisa diukur dan nyata");
        Thread.sleep(2000);
        System.out.println("I love you so much my \"Someone\" :))");
    }
}
