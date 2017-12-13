package builders;

import interfaces.Visitable;
import interfaces.Visitor;

public class TeslaModel3 extends CarBuilder implements Visitable {
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
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
