public class day076 {
    public static void main(String[] args) {
        String teks = "aku sayang dia";
        String anu = teks.substring(4);
        System.out.println(anu);

        String teks2 = "aku tidak iri saat tadi kamu dikerumuni oleh cowok dan kamu menyentuh salah satu mereka";
        String anu2 = teks2.replace("tidak", "");
        System.out.println(anu2);

        String teks3= " dia sayang aku ";
        String anu3 = teks3.trim();
        System.out.println(anu3);
    }
}
