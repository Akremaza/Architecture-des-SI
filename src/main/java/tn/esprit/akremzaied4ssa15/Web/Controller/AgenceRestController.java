package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Agence;
import tn.esprit.akremzaied4ssa15.Services.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("agence")
@RequiredArgsConstructor
public class AgenceRestController {

    private final IAgenceService agenceService;

    @PostMapping
    public Agence add(@RequestBody Agence agence) {
        return agenceService.add(agence);
    }

    @PutMapping
    public Agence update(@RequestBody Agence agence) {
        return agenceService.update(agence);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        agenceService.delete(id);
    }

    @GetMapping("/{id}")
    public Agence getById(@PathVariable Long id) {
        return agenceService.getById(id);
    }

    @GetMapping
    public List<Agence> getAll() {
        return agenceService.getAll();
    }
}
