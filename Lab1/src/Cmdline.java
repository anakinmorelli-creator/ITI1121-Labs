public class Cmdline {
    public static void main(String[] args) {
        System.out.println("Start of the program.");

        int i;

        for (i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " is " + args[i]);
        }

        System.out.println("End of the program.");
    }
}
