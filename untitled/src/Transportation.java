// Jack Cole
// Miles Tutt
public class Transportation {

    private Boolean rental;
    private int speed;
    private int numPassengers;
    private double cost;

    public Transportation(Boolean rental, int speed, int numPassengers, double cost){

        this.rental = rental;
        this.speed = speed;
        this.numPassengers = numPassengers;
        this.cost = cost;
    }
    //mutators
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
