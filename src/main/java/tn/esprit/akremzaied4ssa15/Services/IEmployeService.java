package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Employe;
import java.util.List;

public interface IEmployeService {
    Employe add(Employe employe);
    Employe update(Employe employe);
    void delete(Long id);
    Employe getById(Long id);
    List<Employe> getAll();
}
