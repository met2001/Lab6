import java.util.Scanner;
public class WTCTuttCole {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What transportation would you like to use? (Land, Air, Water): ");
        String transportation = input.nextLine();
        if(transportation.equals("Land")){
            LandTransportation land = new LandTransportation(false,0,0,0);
            System.out.println(land);

        } else if (transportation.equals("Air")) {
            AirTransportation air = new AirTransportation(false,0,0,0);
            System.out.println(air);

        } else if (transportation.equals("Water")) {
            WaterTransportation water = new WaterTransportation(false,0,0,0);
            System.out.println(water);
        }
        else {
            System.out.println("Enter either (Land, Air, or Water)");
        }
    }
}
