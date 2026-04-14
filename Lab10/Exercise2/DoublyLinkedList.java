public class DoublyLinkedList implements List {

    private static class Node {
        private Comparable value;
        private Node previous;
        private Node next;

        private Node ( Comparable value, Node previous, Node next ) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        head = new Node(null, null,null);
        head.next = head;
        head.previous = head;
    }

    public int size() {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Object get( int pos ) {
        throw new UnsupportedOperationException( "error!" );
    }

    @SuppressWarnings("unchecked")
    public boolean add( Comparable o ) {
        if (o == null) {
            throw new IllegalArgumentException("null argument");
        }
        Node current = head.next;

        while (current != head && current.value.compareTo(o) < 0) {
            current = current.next;
        }

        Node newNode = new Node(o, current.previous, current);
        current.previous.next = newNode;
        current.previous = newNode;
        return true;
    }

    public void remove( int pos ) {
        throw new UnsupportedOperationException( "error!" );
    }
}