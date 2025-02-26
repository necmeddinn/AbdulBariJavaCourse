import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int a = 0, b = 1,c;
        for(int i = 0; i <= num-2; i++) {
            c = a + b;
            System.out.print(c + " - ");
            a = b;
            b = c;
        }


    }
}
