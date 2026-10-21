package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Maintenance;
import tn.esprit.akremzaied4ssa15.Services.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("maintenance")
@RequiredArgsConstructor
public class MaintenanceRestController {

    private final IMaintenanceService maintenanceService;

    @PostMapping
    public Maintenance add(@RequestBody Maintenance maintenance) {
        return maintenanceService.add(maintenance);
    }

    @PutMapping
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceService.update(maintenance);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        maintenanceService.delete(id);
    }

    @GetMapping("/{id}")
    public Maintenance getById(@PathVariable Long id) {
        return maintenanceService.getById(id);
    }

    @GetMapping
    public List<Maintenance> getAll() {
        return maintenanceService.getAll();
    }
}
