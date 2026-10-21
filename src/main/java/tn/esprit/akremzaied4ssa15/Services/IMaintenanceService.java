package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance add(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void delete(Long id);
    Maintenance getById(Long id);
    List<Maintenance> getAll();
}
