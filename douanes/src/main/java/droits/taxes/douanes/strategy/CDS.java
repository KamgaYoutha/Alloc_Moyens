package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class CDS implements ITaxeStrategy{
    @Override
    public String getNom() {
        return "CDS";
    }

    @Override
    public double calculer(Simulation simulation) {
        if(simulation.getProduit().getConteneur().equals("40")){
            return 60000;
        } else {
            return 80000;
        }

    }
}
