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
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        Node current = head.next;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current.value;
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
        if (pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException(Integer.toString(pos));
        }
        Node current = head.next;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
    }

    // Both lists store their elements in increasing
    // order, so both lists can be traversed simultaneously.
    @SuppressWarnings("unchecked")
    public void merge( DoublyLinkedList other ) {
        Node node = head.next;
        Node nodeNext= other.head.next;

        while(nodeNext != other.head) {
            if ( node == head ) {
                //VOTRE 1er MORCEAU DU CODE VIENT ICI
                Node newNode = new Node(nodeNext.value, head.previous, head);
                head.previous.next = newNode;
                head.previous = newNode;
                nodeNext = nodeNext.next;
            }
            else if (nodeNext.value.compareTo(node.value) < 0) {
                //insert before
                //VOTRE 2ème MORCEAU DU CODE VIENT ICI
                Node newNode = new Node(nodeNext.value, node.previous, node);
                node.previous.next = newNode;
                node.previous = newNode;
                nodeNext = nodeNext.next;
            }
            else if (node.next == head) {
                //insert after
                //VOTRE 3ème MORCEAU DU CODE VIENT ICI
                Node newNode = new Node(nodeNext.value, node, head);
                node.next = newNode;
                head.previous = newNode;
                node = newNode; // Advance our tracking node to the newly inserted node
                nodeNext = nodeNext.next;
            }
            else {
                //VOTRE 4ème MORCEAU DU CODE VIENT ICI
                node = node.next;
            }
        }
    }
}