package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Employe;
import tn.esprit.akremzaied4ssa15.Services.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("employe")
@RequiredArgsConstructor
public class EmployeRestController {

    private final IEmployeService employeService;

    @PostMapping
    public Employe add(@RequestBody Employe employe) {
        return employeService.add(employe);
    }

    @PutMapping
    public Employe update(@RequestBody Employe employe) {
        return employeService.update(employe);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeService.delete(id);
    }

    @GetMapping("/{id}")
    public Employe getById(@PathVariable Long id) {
        return employeService.getById(id);
    }

    @GetMapping
    public List<Employe> getAll() {
        return employeService.getAll();
    }
}
