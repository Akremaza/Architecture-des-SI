package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement add(Paiement paiement);
    Paiement update(Paiement paiement);
    void delete(Long id);
    Paiement getById(Long id);
    List<Paiement> getAll();
}
