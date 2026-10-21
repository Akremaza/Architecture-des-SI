package tn.esprit.akremzaied4ssa15.Services;

import tn.esprit.akremzaied4ssa15.Domain.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    void delete(Long id);
    Reservation getById(Long id);
    List<Reservation> getAll();
}
