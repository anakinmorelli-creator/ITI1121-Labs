public class ArrayStack<E> implements Stack<E> {

    // Instance variables
    private E[] items;  // Used to store the elements of this ArrayStack
    private int top;    // Designates the first free cell

    @SuppressWarnings( "unchecked" )

    // Constructor
    public ArrayStack( int size ) {
        // YOUR CODE
    }

    // Returns true if this ArrayStack is empty
    public boolean isEmpty() {
        // YOUR CODE
    }

    // Returns the top element of this ArrayStack without removing it
    public E peek() {
        // pre-conditions: ! isEmpty()
        // YOUR CODE
    }

    // Removes and returns the top element of this stack
    public E pop() {
        // pre-conditions: ! isEmpty()
        // YOUR CODE
    }

    // Puts the element onto the top of this stack.
    public void push( E item ) {
        // Pre-condition: the stack is not full
        // YOUR CODE
    }

    public void clear() {
        // YOUR CODE
    }

}
