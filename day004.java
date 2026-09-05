public class day004 {
    public static void main(String[] args) {
        // Byte,Short,int,long. adalah tipe data yang menyimpan angka bilangan bulat yg
        // dibedakan oleh ukuran masing masing tipe data

        // long(8 Byte) dapat menyimpan ukuran
        long banyakUtang = 90000000L;
        // Byte dapat menyimpan ukuran memori -128 s.d 127
        byte jumlahTanggunganKeluarga = 9;
        // int(4 Byte) dapat menyimpan ukuran memori -2.147.483.648 s.d 2.147.483.647
        int jumlahPemasukan = 200000000;
        // Short(2 Byte) dapat menyimpan ukuran -32.768 s.d 32.767
        short tanggunganPerorang = 9000;
        int bansos = 900000;

        System.out.println("Banyak utang\t\t: " + banyakUtang);
        System.out.println("jumlah tanggungan\t: " + jumlahTanggunganKeluarga);
        System.out.println("Pemasukan\t\t: " + jumlahPemasukan);
        System.out.println("biaya per orang\t\t: " + tanggunganPerorang);
        System.out.println("bansos\t\t\t: " + bansos);
    }
}
