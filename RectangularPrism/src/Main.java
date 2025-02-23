import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Rectangular Prism Area and Volume ****");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the edge1 : ");
        int edge1 = input.nextInt();
        System.out.print("Enter the edge2 : ");
        int edge2 = input.nextInt();
        System.out.print("Enter the height : ");
        int height = input.nextInt();

        int area = (edge1 * edge2 * 2) + (height * ((edge1 + edge2) * 2));
        int volume = edge1 * edge2 * height;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}