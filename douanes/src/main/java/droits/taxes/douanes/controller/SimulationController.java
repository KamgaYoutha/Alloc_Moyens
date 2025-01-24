package droits.taxes.douanes.controller;
import droits.taxes.douanes.model.Produit;
import droits.taxes.douanes.model.ResultatSimulation;
import org.springframework.web.bind.annotation.*;
import droits.taxes.douanes.service.SimulationService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class SimulationController {
    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping("/calculer")
    public ResultatSimulation simuler(@RequestBody Produit produit){
        System.out.println("hello");

        return simulationService.simuler(produit);
    }

}
