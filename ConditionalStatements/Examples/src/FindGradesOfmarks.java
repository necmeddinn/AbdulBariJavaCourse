import java.util.Scanner;

public class FindGradesOfmarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks of 3 exams : ");
        int marks1 = input.nextInt();
        int marks2 = input.nextInt();
        int marks3 = input.nextInt();

        double averageMarks = (marks1 + marks2 + marks3) / 3.0;

        if(averageMarks >= 70) {
            System.out.println("Grade A.");
        }else if(averageMarks >= 60 && averageMarks < 70) {
            System.out.println("Grade B.");
        }else if(averageMarks >= 50 && averageMarks < 60) {
            System.out.println("Grade C.");
        }else if(averageMarks >= 40 && averageMarks < 50) {
            System.out.println("Grade D.");
        }
    }
}
