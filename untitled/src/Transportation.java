// Jack Cole
// Miles Tutt
public class Transportation {

    private String rentalOrTicket;
    private double cost;
    private int avgSpeed;
    private int numPassengers;


    public Transportation(String rentalOrTicket, double cost,int avgSpeed,int numPassengers){

        this.rentalOrTicket = rentalOrTicket;
        this.cost = cost;
        this.avgSpeed = avgSpeed;
        this.numPassengers = numPassengers;
    }
    //mutators
    public void setRentalOrTicket(String rentalOrTicket){
        this.rentalOrTicket = rentalOrTicket;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setNumPassengers(int numPassengers){
        this.numPassengers = numPassengers;
    }
    public void setAvgSpeed(int avgSpeed){
        this.avgSpeed = avgSpeed;
    }

    //accessors
    public String getRentalOrTicket(){
        return this.rentalOrTicket;
    }
    public double getCost(){
        return this.cost;
    }
    public int getNumPassengers(){
        return this.numPassengers;
    }
    public int getAvgSpeed(){
        return this.avgSpeed;
    }

    @Override
    public String toString(){
        //String header = String.format("%14s%14s%14s%14s%14s","Rent/Ticket","Cost","Avg Speed","Passengers","Type");
        return String.format("%-20s%-14s\n","Rent/Ticket: ", this.rentalOrTicket) +
                String.format("%-20s%-14.2f\n","Cost: ",this.cost) +
                String.format("%-20s%-14s\n","Avg Speed: ", this.avgSpeed) +
                String.format("%-20s%-14s\n","Num passengers: ", this.numPassengers);
    }
}
