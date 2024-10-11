// Miles Tutt
public class AirTransportation extends Transportation{
    private int milesTraveling;
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

}
