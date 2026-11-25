public class day085 {
    public static void main(String[] args) {
        int []a = {2,1,8};
        int b = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]<a[b]){
                b=a[i];
            }
        }
        System.out.println(a[b]);
    }
}
