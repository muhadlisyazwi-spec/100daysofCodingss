public class day084 {
    public static void main(String[] args) {
        int [] a= {1,7,5};
        int t =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>t){
                t=a[i];
            }
        }
        System.out.println(t);
    }
}
