public class Set implements Comparable <Set> {

    // Instance variables.

    private int first;
    private int second;
    private int third;

    // Constructor

    public Set( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Instance methods
    public int compareTo( Set other ) {
        if (this.first < other.first) return -1;
        if (this.first > other.first) return 1;

        if (this.second < other.second) return -1;
        if (this.second > other.second) return 1;

        if (this.third < other.third) return -1;
        if (this.third > other.third) return 1;

        return 0;
    }

    // previous completed methods
    public boolean equals( Set other ) {
        if (other == null) {
            return false;
        }
        return this.first == other.first &&
                this.second == other.second &&
                this.third == other.third;
    }


    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }

}
