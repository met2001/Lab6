
public class LandTransportation extends Transportation {
    private String fuelType;
    private boolean isRental;

    public LandTransportation(String rentalOrTicket, double cost, int avgSpeed,int numPassengers,
                              String fuelType, boolean isRental) {
        super(rentalOrTicket,cost,avgSpeed,numPassengers);
        this.fuelType = fuelType;
        this.isRental = isRental;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public void setRental(boolean isRental){
        this.isRental = isRental;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public boolean getRental(){
        return this.isRental;
    }

}
