// Jack Cole
// Miles Tutt
public class Transportation {
    private String vehicleType;
    private Boolean rental;
    private int speed;
    private int numPassengers;
    private double cost;

    public Transportation(String vehicleType, Boolean rental, int speed, int numPassengers, double cost){
        this.vehicleType = vehicleType;
        this.rental = rental;
        this.speed = speed;
        this.numPassengers = numPassengers;
        this.cost = cost;
    }
    //mutators
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public void setRental(Boolean rental){
        this.rental = rental;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setNumPassengers(int numPassengers){
        this.numPassengers = numPassengers;
    }
    //accessors
    public String getVehicleType(){
        return this.vehicleType;
    }
    public Boolean getRental(){
        return this.rental;
    }
    public int getSpeed(){
        return this.speed;
    }
    public double getCost(){
        return this.cost;
    }
    public int getNumPassengers(){
        return this.numPassengers;
    }
}
