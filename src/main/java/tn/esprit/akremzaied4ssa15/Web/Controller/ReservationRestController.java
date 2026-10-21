package tn.esprit.akremzaied4ssa15.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.akremzaied4ssa15.Domain.Reservation;
import tn.esprit.akremzaied4ssa15.Services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
public class ReservationRestController {

    private final IReservationService reservationService;

    @PostMapping
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationService.add(reservation);
    }

    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.update(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservationService.delete(id);
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable Long id) {
        return reservationService.getById(id);
    }

    @GetMapping
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }
}
