public class Tribonacci {
    public static void main(String[] args) {
        Tribonacci tb = new Tribonacci();
        int n = 25;
        int n1 = 5;
        int n2 = 10;
        int n3 = 15;

        int result = tb.tribonacci(n);
        System.out.println("Tribonacci for " + n + " is: " + result);
    }

    public int tribonacci(int n) {
        if (n < 2)
            return n;

        int[] ans = { 0, 1, 1 };

        for (int i = 3; i <= n; ++i) {
            final int next = ans[0] + ans[1] + ans[2];
            ans[0] = ans[1];
            ans[1] = ans[2];
            ans[2] = next;
        }

        return ans[2];
    }
}
