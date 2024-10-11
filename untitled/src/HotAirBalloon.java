public class HotAirBalloon extends AirTransportation{
    private double heightFeet;
    public HotAirBalloon(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int milesTraveling, double heightFeet) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, milesTraveling);
        this.heightFeet = heightFeet;
    }
    public void setHeightFeet(double heightFeet){
        this.heightFeet = heightFeet;
    }
    public double getHeightFeet(){
        return this.heightFeet;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
