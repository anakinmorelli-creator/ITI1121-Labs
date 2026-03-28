

public class Set {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variable
    private Cashier[] set;

    // Constructor
    public Set( int nbr ) {
        // YOUR CODE COMES HERE
    }

    // Instance methods
    public void add (Client client) {
        // YOUR CODE COMES HERE
    }

    public void servedClients( int currentTime ) {
        // YOUR CODE COMES HERE
    }

    public String toString() {

        StringBuffer out  = new StringBuffer();

        for ( int i=0; i<set.length; i++ ) {
            out.append( "LINE " + i + " :" + str );
            out.append( set[i] );
            out.append(str );
        }

        return out.toString();
    }
}
