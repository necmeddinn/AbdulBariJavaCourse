import java.util.Scanner;

public class Methods {

    int max(int a, int b) {
        if(a > b) {
            return a;
        }else {
            return b;
        }
    }

    static void increment(int x) {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // max metodunu statik yapmak istemiyorsak, yeni sınıf nesnesi tanımladık ve kendi metdonu çağırdık.
        Methods mp = new Methods();
        int c = mp.max(8,7);
        System.out.println(c);

        int a = 22;

        increment(a);
        System.out.println(a);

    }
}