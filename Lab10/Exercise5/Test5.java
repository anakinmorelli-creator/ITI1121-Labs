
class Test5 {

    public static void main( String[] args ) {

        DoublyLinkedList myList = new DoublyLinkedList();
        if ( myList.size() != 0 )
            System.out.println( "List not empty " );

        // add
        myList.add( new String( "C") );
        myList.add( new String( "E") );
        myList.add( new String( "H") );

        System.out.println("myList size is " + myList.size() );


        /*print*/
        System.out.println( " elements of my first list are : " );
        for ( int i=0; i<3; i++ ) {
            String str = (String)  myList.get( i ) ;
            System.out.println( str );
        }
        System.out.println( "add tested " );



        /**merge**/
        DoublyLinkedList myList2 = new DoublyLinkedList();

        // add
        myList2.add( new String( "A") );
        myList2.add( new String( "B") );
        myList2.add( new String( "C") );
        myList2.add( new String( "F") );


        myList.merge(myList2 );

        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<myList.size(); i++ ) {
            String str = (String)  myList.get( i ) ;
            System.out.println(str);
        }
        System.out.println( "merge tested!" );
    }
}
