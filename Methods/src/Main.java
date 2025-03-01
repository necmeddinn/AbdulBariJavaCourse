import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age of the user: ");
        int age = scanner.nextInt();
        System.out.println("Enter the gender of the user: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the birthday of the user: ");
        String birthday = scanner.nextLine();
        System.out.println("Enter the height of the user: ");
        int height = scanner.nextInt();
        System.out.println("Enter the weight of the user: ");
        int weight = scanner.nextInt();

        System.out.println(name + " " + age + " " + gender + " " + birthday + " " + height + " " + weight);


    }
}