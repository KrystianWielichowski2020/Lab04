package builders;

public class TeslaModelS extends CarBuilder {
    @Override
    public void buildBrand() {
        getCar().setBrand("Tesla");
    }

    @Override
    public void buildModel() {
        getCar().setModel("Model S");
    }

    @Override
    public void buildPrice() {
        getCar().setPrice(60000);
    }
}
