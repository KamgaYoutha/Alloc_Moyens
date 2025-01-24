package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class ISIStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "ISI";
    }

    @Override
    public double calculer(Simulation simulation) {
        return 0;
    }
}
