import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        int A[] = {12,32,43,1,243,5,332,21};
        // Dizideki tüm elemanların toplamını bul

        int sum = 0;
        for(int x: A) {
            sum += x;
        }
        System.out.println("The sum is: " + sum);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int search = scanner.nextInt();

        for(int x: A) {
            if(x == search) {
                System.out.println("The element found at: " + x);
                System.exit(0);
            }
        }
        System.out.println("The element not found at: " + search);

    }
}
