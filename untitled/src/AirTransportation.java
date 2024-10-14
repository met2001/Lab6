// Miles Tutt
public class AirTransportation extends Transportation{
    private int milesTraveling = 0;
    public AirTransportation(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int milesTraveling) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers);
        this.milesTraveling = milesTraveling;
    }
    public void setMilesTraveling(int milesTraveling){
        this.milesTraveling = milesTraveling;
    }
    public int getMilesTraveling(){
        return this.milesTraveling;
    }
    @Override
    public String toString(){
        return super.toString() +
                "Miles Traveling: " + this.milesTraveling + "\n";
    }
}
