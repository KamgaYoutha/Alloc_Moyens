package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class DAC1Strategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "DAC";
    }

    @Override
    public double calculer(Simulation simulation) {
        return simulation.getDac1();
    }
}
