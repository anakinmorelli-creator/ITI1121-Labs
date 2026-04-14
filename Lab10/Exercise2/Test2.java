class Test2 {

    public static void main( String[] args ) {

        DoublyLinkedList myList = new DoublyLinkedList();
        if ( myList.size() != 0 )
            System.out.println( "List not empty " );
        for ( int i=1; i<=10; i++ ) { // add
            myList.add( new Integer( i ) );

            if ( myList.size() != i )
                System.out.println( "size =" + i );

        }
        System.out.println( "myList size =" + myList.size() );

    }
}
