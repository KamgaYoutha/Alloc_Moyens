package droits.taxes.douanes.service;
import droits.taxes.douanes.model.Produit;
import droits.taxes.douanes.model.ResultatSimulation;
import droits.taxes.douanes.model.Simulation;
import org.springframework.stereotype.Service;
import droits.taxes.douanes.strategy.ITaxeStrategy;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service @Transactional
public class SimulationService {
    private final List<ITaxeStrategy> taxeStrategies;

    public SimulationService(List<ITaxeStrategy> taxeStrategies) {
        this.taxeStrategies = taxeStrategies;
    }

    public ResultatSimulation simuler(Produit produit) {
        Simulation simulation = new Simulation();
        simulation.setProduit(produit);
        double valeurEnDouane = produit.getValeurAchat() + produit.getValeurTransport() + produit.getValeurAssurance();
        simulation.setValeurEnDouane(valeurEnDouane);
        double tauxDroitsDouane = getTauxDroitsDouanes(produit.getCategorie());
        double droitsDouane = valeurEnDouane * tauxDroitsDouane;
        double Dac1 = (valeurEnDouane + droitsDouane)*0.01;
        simulation.setDroitsDouane(droitsDouane);

        Map<String,Double> taxes = taxeStrategies.stream()
                .collect(Collectors.toMap(
                        ITaxeStrategy::getNom,
                        strategy -> strategy.calculer(simulation)
                ));


        double totalAPayer = droitsDouane + taxes.values().stream().mapToDouble(Double::doubleValue).sum();
        double tauxGlobal = (totalAPayer/valeurEnDouane)*100;
        ResultatSimulation resultat = new ResultatSimulation();
        resultat.setValeurEnDouane(valeurEnDouane);
        resultat.setDroitsDouane(droitsDouane);
        resultat.setTaxes(taxes);
        resultat.setTotalAPayer(totalAPayer);
        resultat.setTauxGlobal(tauxGlobal);
        return resultat;



    }
      private double getTauxDroitsDouanes(int categorie){
        switch (categorie){
            case 1: return 0.05;
            case 2: return 0.10;
            case 3: return 0.20;
            case 4: return 0.30;
            default: throw new IllegalArgumentException("Categorie invalide");
        }
}
}
