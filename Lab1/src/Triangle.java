public class Triangle {
    public static void main(String[] args) {
        int rows;
        int number;

        for(rows = 1; rows <= 5; rows++) {
            for(number = 1; number <= rows; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
