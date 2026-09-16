package src;

public class day016 {
    public static void main(String[] args) {
        System.out.println(
                "Saya mempunyai 10 permen dan saya membagikan 6 permen ke teman saya, berapa modulus dari permen tersebut");

        int permen = 10;
        int dibagi = 6;
        int sisa = (permen % dibagi);

        System.out.println("Sisa permennya adalah : " + sisa);
    }
}
