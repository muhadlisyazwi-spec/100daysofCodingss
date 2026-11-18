import java.util.Scanner;

public class day078 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        Boolean status = false;
        String nama = "Adli_ganteng";
        String NIM = "0";
        while(!status){
            System.out.print("Masukkan nama: ");
            String name = y.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = y.nextLine();
            if (name.equals("admin")&& nim.equals("admin")){
                System.out.println("anda login sebagai admin");
                status=true;
            }else if (name.equals(nama) && nim.equals(NIM)){
                System.out.print("Anda login sebagai mahasiswa");
                System.out.println();
                status=true;
            }else{ System.out.println("Akun anda tidak ditemukan");
            status=true;
        }
        }
    }
}
