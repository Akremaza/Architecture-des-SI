package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Equipement;
import tn.esprit.akremzaied4ssa15.Services.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("equipement")
@RequiredArgsConstructor
public class EquipementRestController {

    private final IEquipementService equipementService;

    @PostMapping
    public Equipement add(@RequestBody Equipement equipement) {
        return equipementService.add(equipement);
    }

    @PutMapping
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementService.update(equipement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        equipementService.delete(id);
    }

    @GetMapping("/{id}")
    public Equipement getById(@PathVariable Long id) {
        return equipementService.getById(id);
    }

    @GetMapping
    public List<Equipement> getAll() {
        return equipementService.getAll();
    }
}
