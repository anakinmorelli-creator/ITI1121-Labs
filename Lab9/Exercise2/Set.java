public class Set {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variable
    private Cashier[] set;

    // Constructor
    public Set( int nbr ) {
        if (nbr < 1) {
            throw new IllegalArgumentException(Integer.toString(nbr));
        }
        set = new Cashier[nbr];
        for (int i = 0; i < nbr; i++) {
            set[i] = new Cashier();
        }
    }

    // Instance methods
    public void add (Client client) {
        int minIndex = 0;
        int minSize = set[0].getQueueSize();

        for (int i = 1; i < set.length; i++) {
            if (set[i].getQueueSize() < minSize) {
                minSize = set[i].getQueueSize();
                minIndex = i;
            }
        }
        set[minIndex].add(client);
    }

    public void servedClients( int currentTime ) {
        for (int i = 0; i < set.length; i++) {
            set[i].servedClients(currentTime);
        }
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