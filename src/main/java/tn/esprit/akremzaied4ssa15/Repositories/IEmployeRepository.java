package tn.esprit.akremzaied4ssa15.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.akremzaied4ssa15.Domain.Employe;

@Repository
public interface IEmployeRepository extends JpaRepository<Employe, Long> {
}
