package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class TCVStrategy implements ITaxeStrategy {
    @Override
    public String getNom() {
        return "TCV";
    }

    @Override
    public double calculer(Simulation simulation) {
        double taux = 0.01;
        return (simulation.getValeurEnDouane())*taux;
    }
}
