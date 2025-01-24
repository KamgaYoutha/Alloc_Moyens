package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class CACStrategy implements ITaxeStrategy {
    @Override
    public String getNom() {
        return "CAC";
    }

    @Override
    public double calculer(Simulation simulation) {
        return 0;
    }
}
