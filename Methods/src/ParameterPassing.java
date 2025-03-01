import java.util.Scanner;

public class ParameterPassing {

    static boolean isPrime(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Not : Gerçek parametrelerin içeriği resmi parametrelerde kopyalanır.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(isPrime(num) ? "Prime" : "Not prime");

    }
}
