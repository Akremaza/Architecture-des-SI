package tn.esprit.akremzaied4ssa15.Domain;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.type.format.jakartajson.JakartaJsonIntegration;
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;
    @ManyToOne
    Agence agence;
    @OneToMany(mappedBy = "vehicule")
    List<Maintenance> maintenances;
    @ManyToMany
    List<Equipement> equipements;
    @OneToMany(mappedBy = "vehicule")
    List<Reservation> reservations;
}