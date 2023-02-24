public class Power_recursion {
    public static void main(String[] args) {

        int n = 2;
        int pow = 10;

        int ans = power(n, pow);
        System.out.println("Ans is " + ans);
    }

    static int power(int n, int pow) {

        /*
         * if pow is even
         * pow(n,pow)= pow(n, pow/2)* pow(n, pow/2);
         * else
         * pow(n, pow) = n * pow(n, pow/2)*pow(n,pow/2);
         * 
         */
        if (pow == 0) {
            return 1;
        }

        int ans = power(n, pow / 2);
        if ((pow & 1) == 0) {
            pow = pow / 2;
            return ans * ans;
        } else {
            pow = pow / 2;
            return n * ans * ans;
        }
    }
}
