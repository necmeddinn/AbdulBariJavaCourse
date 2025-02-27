public class FindLargestElement {
    public static void main(String[] args) {
        int A[] = {21,32,5,37,86,775,86,53,9889,46};
        int max = A[0];

        for (int i = 1; i<A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println(max);
    }
}
