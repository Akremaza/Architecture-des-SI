package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Client;
import tn.esprit.akremzaied4ssa15.Services.IClientService;

import java.util.List;

@RestController
@RequestMapping("client")
@RequiredArgsConstructor
public class ClientRestController {

    private final IClientService clientService;

    @PostMapping
    public Client add(@RequestBody Client client) {
        return clientService.add(client);
    }

    @PutMapping
    public Client update(@RequestBody Client client) {
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id) {
        return clientService.getById(id);
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }
}
