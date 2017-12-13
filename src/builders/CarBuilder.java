package builders;

import entities.Car;

public abstract class CarBuilder {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void createCar(){
        car = new Car();
    }
    public abstract void buildBrand();
    public abstract void buildModel();
    public abstract void buildPrice();
}
