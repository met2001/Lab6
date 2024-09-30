public class WashingMachineTutt {
    private String brand;
    private String model;
    private double price;

    public WashingMachineTutt(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public double getPrice(){
        return this.price;
    }
    public double salePrice(){
        return this.price * .95;
    }
}
