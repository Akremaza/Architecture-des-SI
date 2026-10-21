package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Contrat;
import tn.esprit.akremzaied4ssa15.Services.IContratService;

import java.util.List;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratRestController {

    private final IContratService contratService;

    @PostMapping
    public Contrat add(@RequestBody Contrat contrat) {
        return contratService.add(contrat);
    }

    @PutMapping
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.update(contrat);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contratService.delete(id);
    }

    @GetMapping("/{id}")
    public Contrat getById(@PathVariable Long id) {
        return contratService.getById(id);
    }

    @GetMapping
    public List<Contrat> getAll() {
        return contratService.getAll();
    }
}
