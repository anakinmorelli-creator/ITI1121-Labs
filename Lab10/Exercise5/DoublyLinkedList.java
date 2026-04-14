

public class DoublyLinkedList implements List{

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

        private Comparable value;

        private Node previous;   //for the previous node
        private Node next; //for the next node

        private Node ( Comparable value, Node previous, Node next ) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    // Instance variables
    private Node head;

    // Empty list.
    public DoublyLinkedList() {
        // a dummy node is created
        head = new Node(null, null,null);
        head.next = head;
        head.previous = head;
    }

    // Instance methods
    public int size() {
        throw new UnsupportedOperationException( "error!" );
    }


    public Object get( int pos ) {
        throw new UnsupportedOperationException( "error!" );
    }

    public boolean add( Comparable o ) {
        throw new UnsupportedOperationException( "error!" );
    }

    public void remove( int pos ) {
        throw new UnsupportedOperationException( "error!" );
    }
// Both lists store their elements in increasing
    // order, so both lists can be traversed simultaneously.

    public void merge( DoublyLinkedList other ) {
        Node node = head.next;
        Node nodeNext= other.head.next;
        while(nodeNext!=other.head){
            if ( node == head ) {
                //VOTRE 1er MORCEAU DU CODE VIENT ICI
            }
            else if (nodeNext.value.compareTo(node.value) < 0){
                //insert before
                //VOTRE 2ème MORCEAU DU CODE VIENT ICI
            }
            else if (node.next==head){
                //insert after
                //VOTRE 3ème MORCEAU DU CODE VIENT ICI
            }
            else {
                //VOTRE 4ème MORCEAU DU CODE VIENT ICI
            }
        }
    }
}

