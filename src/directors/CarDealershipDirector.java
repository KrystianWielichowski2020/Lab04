package directors;

import builders.CarBuilder;
import entities.Car;

public class CarDealershipDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.getCar();
    }

    public void constructCar(){
        carBuilder.createCar();
        carBuilder.buildBrand();
        carBuilder.buildModel();
        carBuilder.buildPrice();
    }
}
