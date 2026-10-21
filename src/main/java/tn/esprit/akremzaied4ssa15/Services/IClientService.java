package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Client;
import java.util.List;

public interface IClientService {
    Client add(Client client);
    Client update(Client client);
    void delete(Long id);
    Client getById(Long id);
    List<Client> getAll();
}
