public class Automobile extends LandTransportation{
    private String model;
    public Automobile(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, String fuelType,
                      boolean isRental, String model) {
        super(rentalOrTicket,cost,avgSpeed,numPassengers,fuelType,isRental);
        this.model = model;
    }
    private void setModel(String model){
        this.model = model;
    }
    private String getModel(){
        return this.model;
    }
    @Override
    public String toString(){
        return super.toString() +
                String.format("%-20s%-14s\n","Model: ",this.model);
    }
}
