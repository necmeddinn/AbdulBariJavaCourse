import java.util.Scanner;

public class YoungPerson {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");
        age = input.nextInt();

        if (age >= 14 && age <= 55){
            System.out.println("You are Young");
        }else{
            System.out.println("You are older");
        }
    }
}
