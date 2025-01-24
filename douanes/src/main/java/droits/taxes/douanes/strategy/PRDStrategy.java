package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class PRDStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "PRD";
    }

    @Override
    public double calculer(Simulation simulation) {
        return 10000;
    }
}
