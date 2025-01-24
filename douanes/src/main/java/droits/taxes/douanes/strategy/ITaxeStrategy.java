package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;

public interface ITaxeStrategy {
    String getNom();
    double calculer(Simulation simulation);
}
