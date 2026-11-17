public class day077 {
    public static void main(String[] args) {
        String a = " aku makan ayam goreng ";

        System.out.println(a.equals(a));
        System.out.println(a.equalsIgnoreCase(a));
        System.out.println(a.contains("u"));
        System.out.println(a.substring(4));
        System.out.println(a.isEmpty());
        System.out.println(a.trim());
        System.out.println(a.replace("ayam", "indomie"));
    }
}
