public class day2 {
    public static void main(String[] args) {
        // Variabel adalah sekumpulan data yg akan di proses untuk menghasilkan output
        // yg diinginkan
        String nama = "M.Adli Syazwi";
        String cewek = "ada lah";
        int umur = 18;
        int tinggi = 178;
        int grup = 2;

        // println() untuk menunjukkan/menampilkan Judul biodata lalu menmbuat garis
        // baru dibawahnya agar outputnya tidak bersambung dengan variabel lain
        System.out.println("========= BIODATA DIRI =========");
        // printf() itu sama dengan println, cuman bedanya printf menggunakan format
        // tertentu untuk menghasilkan output
        System.out.printf("%-15s : %s%n", "Nama", nama);
        System.out.println("Umur            : " + umur);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Grup            : " + grup);
        // print() sama dengan println dan printf, bedanya hanya di penempatan output yg
        // dimana hanya di satu baris saja tanpa membuat garis baru
        System.out.print("Ada cewek?      : " + cewek);

    }

}
