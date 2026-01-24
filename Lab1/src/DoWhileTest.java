public class DoWhileTest {
    public static void main(String[] args) {
        int integer = 123456789;
        int sum = 0;
        int lastDigit = 0;

        do {
            lastDigit = integer % 10;

            sum = sum + lastDigit;

            integer = integer / 10;
        } while(integer > 0);

        System.out.println("The sum is " + sum);
    }
}
