package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class PCTStrategy implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "PCT";
    }

    @Override
    public double calculer(Simulation simulation) {
        if(simulation.getProduit().getRegime().equals("default")){
            double taux = 0.1;
            return (simulation.getValeurEnDouane()*taux);
        } else if (simulation.getProduit().getRegime().equals("permanent")) {
            double taux = 0.05;
            return (simulation.getValeurEnDouane()*taux);
        } else if (simulation.getProduit().getRegime().equals("simplifie")) {
            double taux = 0.02;
            return (simulation.getDroitsDouane()*taux);
        }
        return 0;
    }
}
