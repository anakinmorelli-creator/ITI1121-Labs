class Test3 {

    public static void main( String[] args ) {

        DoublyLinkedList myList = new DoublyLinkedList();
        if ( myList.size() != 0 )
            System.out.println( "List not empty " );

        for ( int i=1; i<=10; i++ ) { // add
            myList.add( new Integer( i ) );

            if ( myList.size() != i )
                System.out.println( "size = " + i );
        }

        myList.add( new Integer( 5 ) );// add
        System.out.println( "myList size = " + myList.size() );

        System.out.println( "Elements values of my list are : " );
        /*print*/
        for ( int i=0; i<=10; i++ ) {
            int m = ( (Integer) myList.get( i ) ).intValue();

            System.out.println( " Element at position " +i  +" is " +m );
        }

    }
}
