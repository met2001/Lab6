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
        return String.format("%-20s\n", "Submarine") + super.toString() +
                String.format("%-20s%-14s\n","Depth: ",this.depth);
    }
}
