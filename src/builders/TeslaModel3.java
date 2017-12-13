package builders;

public class TeslaModel3 extends CarBuilder {
    @Override
    public void buildBrand() {
        getCar().setBrand("Tesla");
    }

    @Override
    public void buildModel() {
        getCar().setModel("Model 3");
    }

    @Override
    public void buildPrice() {
        getCar().setPrice(30000);
    }
}
