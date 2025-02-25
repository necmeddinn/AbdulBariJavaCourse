import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.print("Enter two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();

        input.nextLine();
        System.out.println("Enter option in words: ");
        String option = input.nextLine();
        option = option.toUpperCase();

        switch (option) {
            case "ADD":
                System.out.println("You have entered " + a + " and " + b + ".");
                System.out.println("Result : " + (a + b));
                break;
            case "SUB":
                System.out.println("You have entered " + a + " and " + b + ".");
                System.out.println("Result : " + (a - b));
                break;
            case "MUL":
                System.out.println("You have entered " + a + " and " + b + ".");
                System.out.println("Result : " + (a * b));
                break;
            case "DIV":
                System.out.println("You have entered " + a + " and " + b + ".");
                System.out.println("Result : " + (a / b));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
