package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Agence;
import java.util.List;

public interface IAgenceService {
    Agence add(Agence agence);
    Agence update(Agence agence);
    void delete(Long id);
    Agence getById(Long id);
    List<Agence> getAll();
}
