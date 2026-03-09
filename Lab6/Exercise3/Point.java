class Point implements Comparable <Point> {
    private int x, y ;

    Point (int x, int y){
        this.x = x ;
        this.y = y ;
    }

    public void display() {
        System.out.println ( x + " " + y ) ;
    }

    public int compareTo (Point p) {
        double thisDist = Math.sqrt(this.x * this.x + this.y * this.y);
        double pDist = Math.sqrt(p.x * p.x + p.y * p.y);

        if (thisDist == pDist) return 0;
        return (thisDist > pDist) ? 1 : -1;
    }
}