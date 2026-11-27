public class day087 {
    public static void main(String[] args) {
        int[]a = {7,8,9};

        //akses array
        System.out.println(a[2]);
        //mengubah array
        a[2]=10;
        //menambah array
        int[] b = new int[a.length+1];
        System.out.println(b.length);
        //mengurangi array
        int[] c = new int [a.length-1];
        System.out.println(c.length);
        //membalik urutan 
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]+" ");
        }
    }
}
