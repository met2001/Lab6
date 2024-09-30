import java.util.Scanner;
public class WMTestTutt {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        WashingMachineTutt[] WMList = new WashingMachineTutt[3];
        for(int i =0;i<3;i++){
            System.out.print("Brand: ");
            String brand = input.nextLine();
            System.out.print("Model: ");
            String model = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();
            WashingMachineTutt washingMachine = new WashingMachineTutt(brand,model,price);
            WMList[i] = washingMachine;
        }
        System.out.printf("%10s%10s%10s%15s\n","Brand","Model","Price","Sale Price");
        for(int i =0; i<WMList.length;i++){
            System.out.printf("%10s%10s%10.2f%15.2f\n",WMList[i].getBrand(),WMList[i].getModel(),WMList[i].getPrice(),WMList[i].salePrice());
        }
    }

}
