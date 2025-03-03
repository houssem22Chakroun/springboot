package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @JsonProperty
     String idReservation;

    @Temporal(TemporalType.DATE)
    @JsonProperty
     Date anneeUniversitaire;
    @JsonProperty
     Boolean estValide;
     @ManyToMany(cascade = CascadeType.ALL)
     @JsonProperty
    Set<Etudiant> etudiants;
}