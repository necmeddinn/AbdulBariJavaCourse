import java.util.Scanner;

public class InsertDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[4];
        int B[] = {21,23,32,34,23,153,1253,567};

        System.out.print("Select process (Inster / Delete) : ");
        String process = scanner.nextLine();
        process = process.toUpperCase();
        switch (process) {
            case "INSERT":
                System.out.print("Enter integers : ");
                for (int i = 0; i < A.length; i++) {
                    A[i] = scanner.nextInt();
                }
                for (int x : A) {
                    System.out.println(x);
                }
                break;
            case "DELETE":
                System.out.print("Enter integers : ");
                int delete = scanner.nextInt();
                for (int i = 0; i < B.length; i++) {
                    if (delete == B[i]) {
                        B[i] = 0;
                    }
                }
                for (int x : B) {
                    System.out.println(x);
                }
                break;
            default:
                break;
        }
    }
}
