package droits.taxes.douanes.model;


import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Simulation {
    private Produit produit;
    private double valeurEnDouane;
    private double droitsDouane;
    private double Dac1;
}
