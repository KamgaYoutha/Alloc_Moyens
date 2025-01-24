package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class PROStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "PRO";
    }

    @Override
    public double calculer(Simulation simulation) {
        double taux = 0.0005;
        return (simulation.getValeurEnDouane()*taux);
    }
}
