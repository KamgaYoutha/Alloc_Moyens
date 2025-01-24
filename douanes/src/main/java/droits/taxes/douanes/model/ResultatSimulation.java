package droits.taxes.douanes.model;

import lombok.*;

import java.util.Map;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ResultatSimulation {
    private double valeurEnDouane;
    private double droitsDouane;
    private Map<String,Double> taxes;
    private double totalAPayer;
    private double tauxGlobal;

}
