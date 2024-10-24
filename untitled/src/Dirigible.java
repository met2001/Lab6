public class Dirigible extends AirTransportation{
    private int heliumAmount;

    public Dirigible(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int milesTraveling, int heliumAmount) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, milesTraveling);
        this.heliumAmount = heliumAmount;
    }
    public void setHeliumAmount(int heliumAmount){
        this.heliumAmount = heliumAmount;
    }
    public int getHeliumAmount(){
        return this.heliumAmount;
    }
    @Override
    public String toString(){
        return String.format("%-20s\n", "Dirigible") + super.toString() +
                String.format("%-20s%-14s\n","Helium: ",this.heliumAmount);
    }
}
