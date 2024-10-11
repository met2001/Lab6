public class Submarine extends WaterTransportation{
    private double depth;
    public Submarine(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int nauticalMiles, double depth) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, nauticalMiles);
        this.depth = depth;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }
    public double getDepth(){
        return this.depth;
    }
    public String toString(){
        return super.toString();
    }
}
