import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("**** Quadratic Equations ****");
        System.out.println("--> aX2 + bX + c = 0 ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the 'a' value : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the 'b' value : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the 'c' value : ");
        double c = scanner.nextDouble();

        if (Math.sqrt(b * b - 4 * a * c) >= 0) {
            double x1 = (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else {
            System.out.println("There is no real root");
        }

    }
}