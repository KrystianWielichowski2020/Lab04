package interfaces;

import builders.TeslaModel3;
import builders.TeslaModelS;

public interface Visitor {
    public void visit(TeslaModel3 car);
    public void visit(TeslaModelS car);
}
