import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int counter = 0;
        int a = num;

        while (a > 0) {
            a /= 10;
            counter++;
        }

        int sum = 0;
        int b = num;

        while (b > 0) {
            int digit = b % 10;
            sum += Math.pow(digit, counter);
            b /= 10;
        }
        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
