package builders;

import interfaces.Visitable;
import interfaces.Visitor;

public class TeslaModelS extends CarBuilder implements Visitable {
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
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
