
class Test5_2 {

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
        System.out.println( "add tested " );



        /*remove*/
        for ( int i=0; i<10 && myList.size() > 0; i++ ) {
            int m = ( (Integer)  myList.get( 0 ) ).intValue();
            myList.remove( 0 );
        }

        System.out.println( "size is " + myList.size());
        System.out.println( "remove tested!" );


        /*add */
        for ( int i=10; i>=1; i--  ) { // add
            myList.add( new Integer( i ) );

            if ( myList.size() != 10 - i + 1 )
                System.out.println( "size # " + i );
        }

        /**merge**/
        DoublyLinkedList myList2 = new DoublyLinkedList();

        for ( int i=1; i<10; i=i+2 ) {
            myList2.add( new Integer( i ) );
        }

        myList.merge( myList2);

        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<15; i++ ) {
            int m = ( (Integer) myList.get( i ) ).intValue();

            System.out.println(m);

        }
        System.out.println( "merge tested!" );
    }
}
