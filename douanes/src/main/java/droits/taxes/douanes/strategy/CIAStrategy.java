package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class CIAStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "CIA";
    }

    @Override
    public double calculer(Simulation simulation) {
        double taux = 0.002;
        return (simulation.getValeurEnDouane()*taux);
    }
}
