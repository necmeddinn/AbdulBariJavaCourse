import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //System.out.println(args[0]);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        if (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("The input number is : " + num);
        } else {
            System.out.println("Invalid input!!!");
        }

    }
}