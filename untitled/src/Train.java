public class Train extends LandTransportation{
    private String stationDest;
    public Train(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, String fuelType,
                 boolean isRental, String stationDest) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, fuelType, isRental);
        this.stationDest = stationDest;
    }
    public void setStationDest(String stationDest){
        this.stationDest = stationDest;
    }
    public String getStationDest(){
        return this.stationDest;
    }
    @Override
    public String toString(){
        return String.format("%-20s\n", "Train") + super.toString() +
                String.format("%-20s%-14s\n","Station Dest: ",this.stationDest);
    }
}
