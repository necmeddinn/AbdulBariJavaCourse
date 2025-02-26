import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        // Count digits of a number
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int counter = 0;
//        while (number > 0){
//            number = number / 10;
//            counter++;
//        }
//        System.out.println("Number of digits = " + counter);

        //Display digits of number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int a;
        int i = 1;

        while (number > 0) {
            a = number % 10;
            number /= 10;
            System.out.println(i + ". places = " + a);
            i++;
        }

    }
}
