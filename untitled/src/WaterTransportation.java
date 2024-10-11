
public class WaterTransportation extends Transportation{
    private int nauticalMiles;

    public WaterTransportation(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int nauticalMiles) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers);
        this.nauticalMiles = nauticalMiles;
    }
    public void setNauticalMiles(int nauticalMiles){
        this.nauticalMiles = nauticalMiles;
    }
    public int getNauticalMiles(){
        return this.nauticalMiles;
    }

}
