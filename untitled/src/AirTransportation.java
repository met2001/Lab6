// Miles Tutt
public class AirTransportation extends Transportation{

    public AirTransportation(Boolean rental, int speed, int numPassengers, double cost) {
        super(rental, speed, numPassengers, cost);
    }
    @Override
    public String toString(){
        return String.format("%15s%20s%15s\n","Helicopter","Hot Air Balloon","Plane");
    }
}
