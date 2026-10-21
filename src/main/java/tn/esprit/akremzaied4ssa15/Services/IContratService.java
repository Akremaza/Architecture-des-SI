package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Contrat;
import java.util.List;

public interface IContratService {
    Contrat add(Contrat contrat);
    Contrat update(Contrat contrat);
    void delete(Long id);
    Contrat getById(Long id);
    List<Contrat> getAll();
}
