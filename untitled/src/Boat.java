public class Boat extends WaterTransportation{
    private boolean hasMotor;
    public Boat(String rentalOrTicket, double cost, int avgSpeed, int numPassengers, int nauticalMiles, boolean hasMotor) {
        super(rentalOrTicket, cost, avgSpeed, numPassengers, nauticalMiles);
        this.hasMotor = hasMotor;
    }
    public void setHasMotor(boolean hasMotor){
        this.hasMotor = hasMotor;
    }
    public boolean getHasMotor(){
        return this.hasMotor;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
