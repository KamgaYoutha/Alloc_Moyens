package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class RIStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "RI";
    }

    @Override
    public double calculer(Simulation simulation) {
        double taux = 0.0045;
        return (simulation.getValeurEnDouane()*taux);
    }
}
