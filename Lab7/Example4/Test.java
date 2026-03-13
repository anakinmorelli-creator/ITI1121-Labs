public class Test {

    public static boolean algorithm2( String str ) {

        Stack<Character> myStack;
        myStack = new ArrayStack<Character>( 100 );

        for ( int i=0; i<str.length(); i++ ) {

            char current = str.charAt( i );

            if ( current == '(' || current == '[' || current == '{' ) {

                // YOUR FIRST PART OF THE CODE HERE (1 LINE ONLY)

            } else if ( current == ')' || current == ']' || current == '}' ) {
                // YOUR SECOND PART OF THE CODE HERE
            }
        }
        return myStack.isEmpty ();
    }

    public static void main( String[] args ) {

        System.out.println( "algorithm2( \"" + "()[]() " + "\" ) returns " + algorithm2( "()[]()" ) );
        System.out.println( "algorithm2( \"" + "(14 * (47 - 2))) " + "\" ) returns " + algorithm2( "(14 * (47 - 2)) )" ) );
        System.out.println( "algorithm2( \"" + "((())" + "\" ) returns " + algorithm2( "((())" ) );

    }
}
