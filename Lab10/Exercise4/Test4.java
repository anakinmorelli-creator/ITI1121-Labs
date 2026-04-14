class Test4 {

    public static void main( String[] args ) {

        DoublyLinkedList myList = new DoublyLinkedList();
        if ( myList.size() != 0 )
            System.out.println( "List not empty " );

        for ( int i=1; i<=10; i++ ) { // add
            myList.add( new Integer( i ) );

            if ( myList.size() != i )
                System.out.println( "size # " + i );
        }


        System.out.println( "Elements values of my list are : " );
        /*print*/
        for ( int i=0; i<10; i++ ) {
            int m = ( (Integer) myList.get( i ) ).intValue();

            System.out.println( " Element at position " +i  +" is " +m );
        }

        /*remove*/

        for ( int i=0; i<10 && myList.size() > 0; i++ ) {
            int m = ( (Integer) myList.get( 0 ) ).intValue();
            myList.remove( 0 );
        }
        System.out.println( );
        System.out.println( " after remove, myList size is " + myList.size());

    }
}
