public class day083 {
    public static void main(String[] args) {
        int [] a = {123,456,789};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b+=a[i];
        }
        System.out.println(b);
    }
}
