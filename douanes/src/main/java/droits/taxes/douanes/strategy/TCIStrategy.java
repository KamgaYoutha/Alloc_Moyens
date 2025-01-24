package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class TCIStrategy implements ITaxeStrategy {
    @Override
    public String getNom() {
        return "TCI";
    }

    @Override
    public double calculer(Simulation simulation) {
        double taux = 0.01;
        return (simulation.getValeurEnDouane()*taux);
    }
}
