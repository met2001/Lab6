public class Helicopter extends AirTransportation{
    private double fuel;
    public Helicopter(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int milesTraveling, double fuel) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, milesTraveling);
        this.fuel = fuel;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return this.fuel;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
