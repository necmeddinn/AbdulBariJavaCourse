public class MethodOverloading {

    static int max(int a, int b) {
        return (a>b) ? a: b;
    }

    static int max(int a, int b, int c) {
        return max(a,max(b,c));
    }

    static float max(float a, float b) {
        return (a>b) ? a: b;
    }

    public static void main(String[] args) {
        int x = 30, y = 22;
        System.out.println(max(x, y));
        System.out.println(max(22,31,27));

        System.out.println(max(22.5f,30.6f));
    }
}
