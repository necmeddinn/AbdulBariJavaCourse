import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[][] = new int[3][4];
        int B[][];
        B = new int[3][4];

        int C[][] = {{1,2,3,12},{4,5,6,11},{7,8,9,10}};

        for ( int row = 0; row < C.length; row++ ) {
            for ( int col = 0; col < C[row].length; col++) {
                System.out.print(C[row][col] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("------------");

        // Diziye eleman yazma
        for ( int row = 0; row < A.length; row++ ) {
            for ( int col = 0; col < A[row].length; col++) {
                System.out.print("Enter element at " + row + " column " + col + " : ");
                int value = scanner.nextInt();
                A[row][col] = value;
            }
            System.out.println("\n");
        }
        // Dizideki elemanları okuma

        for(int x[] : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }

    }
}
