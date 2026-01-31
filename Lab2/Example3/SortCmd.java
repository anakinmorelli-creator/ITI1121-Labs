public class SortCmd {
    public static void sort( int[] tab) {
        int i, j, min, tmp;
        for(i = 0; i < tab.length - 1; i++) {
            min = i;
            for(j = i + 1; j < tab.length; j++) {
                if(tab[j] < tab[min]) {
                    min = j;
                }
            }
            tmp = tab[min];
            tab[min] = tab[i];
            tab[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int i;
        int[] numbers = new int[args.length];

        for(i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        sort(numbers);

        System.out.print("The sorted array is: {");
        for(i = 0; i < numbers.length; i++) {
            if(i > 0) {
                System.out.print(",");
            }
            System.out.print(numbers[i]);
        }
        System.out.print("}");
    }
}
