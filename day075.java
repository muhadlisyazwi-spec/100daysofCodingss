import java.util.Scanner;

public class day075 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        String a = y.nextLine();
        if (a.equals("adli")){
            System.out.println("halo ganteng");
        }else System.out.println("Lu siapa");
        String b = y.nextLine();
        if(b.equalsIgnoreCase("matcha")){
            System.out.println("my favorit gue");
        }else System.out.println("huek");
        
        String c = y.nextLine();
        if(c.contains("indomie")){
            System.out.println("favoriteku");
        }
        else if(c.isEmpty()){
        System.out.println("isi kocak");
        }else System.out.println("apaan tuh");
    }
}
