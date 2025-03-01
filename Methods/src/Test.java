public class Test {

    static void change(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {
        int A[] = {2,3,4,5,6};
        System.out.println(A[3]);
        change(A,3,22);
        System.out.println(A[3]);
    }
}
