public class WhileTest {
    public static void main(String[] args) {
        int integer = 123456789;
        int sum = 0;
        int lastDigit = 0;

        while (integer > 0) {
            lastDigit = integer % 10;

            sum = sum + lastDigit;

            integer = integer / 10;
        }

        System.out.println("The sum is " + sum);
    }
}
