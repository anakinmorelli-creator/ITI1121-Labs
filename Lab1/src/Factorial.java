public class Factorial {
    public static int factorial(int n) {
        int i;
        int product = 1;

        for(i = 1; i <= n; i++) {
            product = product * i;
        }

        return product;
    }

    public static void main(String[] args) {
        int n;
        int answer;

        n = Integer.parseInt(args[0]);

        answer = factorial(n);

        System.out.println(answer);

    }
}
