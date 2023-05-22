public class Recursion {
    public static int GiaiThuat(int n) {
        if (n == 0) {
            return 1;
        }
        return n * GiaiThuat(n - 1);
    }

    public static int Fibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void main(String[] args) {

    }
}
