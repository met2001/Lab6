
public class WaterTransportation extends Transportation{

    public WaterTransportation(Boolean rental, int speed, int numPassengers, double cost) {
        super(rental, speed, numPassengers, cost);
    }
    @Override
    public String toString(){
        return String.format("%15s%15s%15s%15s\n","Boat","Dirigible","Ship","Submarine");
    }
}
