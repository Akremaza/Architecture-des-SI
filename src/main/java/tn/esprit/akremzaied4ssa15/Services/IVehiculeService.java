package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
}