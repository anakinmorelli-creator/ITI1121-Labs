public class Exercise5 {
    public static void main(String[] args) {
        try {
            int[] negativeArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("generated exception: " + e);
        }
        System.out.println(" After the try block");
    }
}