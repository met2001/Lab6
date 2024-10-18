public class Ship extends WaterTransportation{
    private String shipCompany;
    public Ship(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int nauticalMiles, String shipCompany) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, nauticalMiles);
        this.shipCompany = shipCompany;
    }
    public void setShipCompany(String shipCompany){
        this.shipCompany = shipCompany;
    }
    public String getShipCompany(){
        return this.shipCompany;
    }
    public String toString(){
        return String.format("%-20s\n", "Ship") + super.toString() +
                String.format("%-20s%-14s\n","Ship Company: ",this.shipCompany);
    }
}
