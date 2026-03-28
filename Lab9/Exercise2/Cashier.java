
public class Cashier {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variables
    private Queue<Client> queue;
    private Client currentClient;

    private int ClientTime;
    private int ClientsServed;
    private int ItemsDone;

    //Constructor
    public Cashier(){
        // YOUR CODE DEVELOPED IN EX1
    }

    // Instance methods
    public void add( Client client ) {
        // YOUR CODE DEVELOPED IN EX1
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void servedClients( int currentTime ){

        // YOUR CODE DEVELOPED IN EX1

    }

    public int getClientTime() {
        return ClientTime;
    }

    public int getItemsDone() {
        return ItemsDone;
    }

    public int getClientsServed() {
        return ClientsServed;
    }


    public String toString() {

        StringBuffer out= new StringBuffer();

        out.append( "The total number of clients served is " );
        out.append( ClientsServed );
        out.append( str );

        out.append( "The average number of items per client was " );
        out.append( ItemsDone / ClientsServed );
        out.append( str );

        out.append( "The average time (in seconds) was " );
        out.append( ClientTime / ClientsServed );
        out.append( str );

        return out.toString();
    }

}
