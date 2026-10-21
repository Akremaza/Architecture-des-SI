package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Paiement;
import tn.esprit.akremzaied4ssa15.Services.IPaiementService;

import java.util.List;

@RestController
@RequestMapping("paiement")
@RequiredArgsConstructor
public class PaiementRestController {

    private final IPaiementService paiementService;

    @PostMapping
    public Paiement add(@RequestBody Paiement paiement) {
        return paiementService.add(paiement);
    }

    @PutMapping
    public Paiement update(@RequestBody Paiement paiement) {
        return paiementService.update(paiement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paiementService.delete(id);
    }

    @GetMapping("/{id}")
    public Paiement getById(@PathVariable Long id) {
        return paiementService.getById(id);
    }

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.getAll();
    }
}
