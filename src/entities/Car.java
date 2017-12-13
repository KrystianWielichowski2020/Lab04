package entities;

public class Car {
    private String brand, model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " cena: " + price + " USD";
    }
}
