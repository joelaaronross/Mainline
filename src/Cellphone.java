

public class Cellphone {
	private String mfg;
    private double price;
    private String model;
    private String color;

    public Cellphone(String mfg, double price, String model, String color) { //one instance of THIS cell phone
        
        this.price = price;
        this.mfg = mfg;
        // this.price = price;
        this.model = model;
        this.color = color;
    }
    public String getMfg() {
        return mfg;
    }
    public void setMfg(String mfg) {
        this.mfg = mfg;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<500) {
            this.price = 500;
        }
        else {
            this.price = price;
        }
        // this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
