public class Bike extends LandTransportation{
    private String bikeModel;
    public Bike(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, String fuelType,
                boolean isRental, String bikeModel) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, fuelType, isRental);
        this.bikeModel = bikeModel;
    }
    public void setBikeModel(String bikeModel){
        this.bikeModel = bikeModel;
    }
    public String getBikeModel(){
        return this.bikeModel;
    }
    @Override
    public String toString(){
        return super.toString() + String.format("%15s","Bike\n");
    }
}
