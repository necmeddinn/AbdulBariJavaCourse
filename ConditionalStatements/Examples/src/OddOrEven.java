import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        // Tek Çift bulma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }
    }
}