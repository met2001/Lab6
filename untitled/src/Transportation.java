public class Transportation {
    String vehicleType;
    Boolean rental;
    int speed;
    int numPassengers;
    double cost;

    public Transportation(String vehicleType, Boolean rental, int speed, int numPassengers, double cost){
        this.vehicleType = vehicleType;
        this.rental = rental;
        this.speed = speed;
        this.numPassengers = numPassengers;
        this.cost = cost;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
}
