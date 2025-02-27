public class Main {
    public static void main(String[] args) {
        int A[] = new int[5];
        System.out.println(A.length);

        int B[] = {1,2,3,4,5,6,7};
        System.out.println(B.length);
        //System.out.println(A[3]);

        for (int i = 0; i<B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
        for(int j = B.length-1; j>=0; j--) {
            System.out.println("B[" + j + "] = " + B[j]);
        }

        System.out.println("-----------");
        // for-each döngüsü

        for(int x: B) {
            System.out.println(x);
        }
    }
}