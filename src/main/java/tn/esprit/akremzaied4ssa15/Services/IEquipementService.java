package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    void delete(Long id);
    Equipement getById(Long id);
    List<Equipement> getAll();
}
