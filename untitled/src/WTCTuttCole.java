import java.util.Scanner;
public class WTCTuttCole {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Boat boat = new Boat("Rental",50.00,30,6,6,true);
        Submarine submarine = new Submarine("Ticket",500.00,15,6,3,400.60);
        Ship ship = new Ship("Ticket",150,40,400,200,"Disney");
        // Polymorphism
        WaterTransportation[] waterTransport = {boat,submarine,ship};

        Train train = new Train("Ticket",70,80,60,"Electric",false,"New York");
        Automobile automobile = new Automobile("Rental",120,60,4,"Gas",true,"Mercedes Benz");
        Bus bus = new Bus("Ticket",10,40,30,"Gas",false,"Six Fork Road");
        Bike bike = new Bike("Rental",20,20,1,"None",true,"Schwynn");
        // Polymorphism
        LandTransportation[] landTransport = {automobile,bus,bike};

        Helicopter helicopter = new Helicopter("Ticket",900,50,5,70,343.23);
        HotAirBalloon hotairballoon = new HotAirBalloon("Ticket",300,10,6,3,1000.32);
        Plane plane = new Plane("Ticket", 400,550, 150,1100,"Delta");
        Dirigible dirigible = new Dirigible("Ticket",300,20,10,8,1059);
        // Polymorphism
        AirTransportation[] airTransport = {helicopter,hotairballoon,plane,dirigible};
        String options = "";

        System.out.print("What transportation would you like to use? (Land, Air, Water): ");
        String transportation = input.nextLine();
        if(transportation.equals("Land")){

            for(LandTransportation landTrans : landTransport){
                System.out.println(landTrans);
            }
            options = "Train, Automobile, Bus, Bike";
        } else if (transportation.equals("Air")) {

            for(AirTransportation airTrans : airTransport){
                System.out.println(airTrans);
            }
            options = "Helicopter, Hot Air Balloon, Plane, Dirigible";
        } else if (transportation.equals("Water")) {
            
            for(WaterTransportation waterTrans : waterTransport){
                System.out.println(waterTrans);
            }
            options = "Boat, Submarine, Ship";
        }
        else {
            System.out.println("Enter either (Land, Air, or Water)");
        }
        System.out.println("Options " + options + ": ");
        String transportOption = input.nextLine();

    }
}
