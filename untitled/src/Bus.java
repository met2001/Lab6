public class Bus extends LandTransportation{
    private String destination;
    public Bus(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, String fuelType,
               boolean isRental,String destination) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, fuelType, isRental);
        this.destination = destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDestination(){
        return this.destination;
    }
    @Override
    public String toString(){
        return super.toString() + String.format("%15s","Bus\n");
    }
}
