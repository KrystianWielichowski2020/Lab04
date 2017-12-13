package presenters;

import builders.TeslaModel3;
import builders.TeslaModelS;
import interfaces.Visitor;

public class Presenter implements Visitor{

    @Override
    public void visit(TeslaModel3 car) {
        System.out.println("Tesla model 3: Poczuj elektyczną rewolucję za jedyne 30 000 dolców");
    }

    @Override
    public void visit(TeslaModelS car) {
        System.out.println("Tesla model S: Poczuj elektyczną rewolucję w ekskluzywnym wydaniu");
    }
}
