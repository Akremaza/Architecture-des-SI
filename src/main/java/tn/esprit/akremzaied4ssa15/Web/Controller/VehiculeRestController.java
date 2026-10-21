package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Vehicule;
import tn.esprit.akremzaied4ssa15.Services.IVehiculeService;

import java.util.List;

@RequestMapping("vehicule")
@RestController
@RequiredArgsConstructor
public class VehiculeRestController {

    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule createVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.createVehicule(vehicule);
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules(){
        return vehiculeService.getAllVehicules();
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeService.deleteVehicule(id);
    }
}