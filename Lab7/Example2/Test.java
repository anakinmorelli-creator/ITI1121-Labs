public class Test {

    static Stack<Integer> sort(Stack<Integer> p1) {
        // YOUR CODE HERE
    }

    public static void main( String[] args ) {

        int[] tab = {4,3,2,5,8,0,2,6,9,3};
        Stack<Integer> pile;
        pile = new ArrayStack<Integer>( 10 );


        Stack<Integer> sortedPile;
        sortedPile = new ArrayStack<Integer>( 10 );

        /*stack the tab elements and display its elements*/
        for (int i = 0; i < tab.length; i++) {
            pile.push(tab[i]);
        }

        System.out.println( "The elements of my stack are initially: "  );
        while ( ! pile.isEmpty() ) {
            System.out.println(  pile.pop() );
        }


        /*Re-stack the stack using Tab and display its sorted elements*/
        for (int i = 0; i < tab.length; i++) {
            pile.push(tab[i]);
        }
        sortedPile = sort(pile);

        System.out.println();
        System.out.println( "The elements of my sorted stack are: "  );
        while ( !sortedPile.isEmpty() ) {
            System.out.println( sortedPile.pop() );
        }

    }

}