public class Main {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 15;

        System.out.println(a<b && b>c);

        if(a<b && b>c) {
            System.out.println(a);
        } else if(b>c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}