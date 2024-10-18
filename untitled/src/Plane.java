public class Plane extends AirTransportation{
    private String airline;
    public Plane(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int milesTraveling, String airline) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, milesTraveling);
        this.airline = airline;
    }
    public void setAirline(String airline){
        this.airline = airline;
    }
    public String getAirline(){
        return this.airline;
    }
    @Override
    public String toString(){
        return String.format("%-20s\n", "Plane") + super.toString() +
                String.format("%-20s%-14s\n","Airline: ",this.airline);
    }
}
