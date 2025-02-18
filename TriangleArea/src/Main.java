import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Select area calculation method (1-Height/2-edge) : ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print("Enter height : ");
                double height = input.nextDouble();
                System.out.print("Enter width : ");
                double width = input.nextDouble();

                double area = (height * width) / 2;
                System.out.println("The area of the triangle is " + area);
                break;
            case 2:
                System.out.print("Enter the edge a : ");
                double a = input.nextDouble();
                System.out.print("Enter the edge b : ");
                double b = input.nextDouble();
                System.out.print("Enter the edge c : ");
                double c = input.nextDouble();

                double s = (a + b + c) / 2;
                double area2 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("The area of the triangle is " + area2);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        input.close();
    }
}