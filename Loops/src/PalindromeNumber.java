import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numMain = scanner.nextInt();

        // Sayısı ters çevir ve orijinali ile karşılaştır.
        int reverse = 0,r;
        int num = numMain;
        while (num > 0) {
            r = num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;
        }

        //System.out.println(reverse);
        if (reverse == numMain) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
