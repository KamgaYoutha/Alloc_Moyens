package droits.taxes.douanes.strategy;

import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Component;

@Component
public class TVAStrategy implements ITaxeStrategy {


    @Override
    public String getNom(){

        return "TVA";
    }

    @Override
    public double calculer(Simulation simulation) {
        if(simulation.getProduit().getZoneOrigine().equals("Afrique") ||
                simulation.getProduit().getZoneOrigine().equals("UE")){
            return 0;
        }
        double taux = 0.175;
        return (simulation.getValeurEnDouane() + simulation.getDroitsDouane() + simulation.getDac1()) *taux;
    }
}
