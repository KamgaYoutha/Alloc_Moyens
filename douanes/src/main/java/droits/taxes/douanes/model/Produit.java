package droits.taxes.douanes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter @Setter @Entity
@NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id
    private int categorie;
    private double valeurAchat;
    private double valeurTransport;
    private double valeurAssurance;
    private String zoneOrigine;
    private String portDouane;
    private String regime;
    private String conteneur;

}
