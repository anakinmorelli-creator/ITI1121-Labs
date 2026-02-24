
public class Contract extends Employee {

    private double nbHours = -1.0;
    private double hourRate = -1.0;
    private double percentHourSup  = -1.0;
    private static final double dueHour  = 40.0;

    Contract(String name) {
        // YOUR CODE COMES HERE
    }

    Contract (String name, double nbHours, double hourRate, double percentHourSup) {
        // YOUR CODE COMES HERE
    }

    public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup) {
        // YOUR CODE COMES HERE
    }


    public double getSalary() {
        // YOUR CODE COMES HERE
    }

    public double getNbHours() {
        return nbHours;
    }

    public double getHourRate() {
        return hourRate;
    }

    public double getPercentHourSup() {
        return percentHourSup;
    }

    public String toString() {
        return super.toString() + "; nbHours=" + nbHours
                + "; Hour rate=" + hourRate + "; % Hour Sup=" + percentHourSup;
    }

}

