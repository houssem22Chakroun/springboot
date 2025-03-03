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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
     Long idEtudiant;
    @JsonProperty
     String nomEt;
    @JsonProperty
     String prenomEt;
    @JsonProperty
     Long cin;
    @JsonProperty
     String ecole ;


    @Temporal(TemporalType.DATE)
    @JsonProperty
     Date dateNaissance;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "etudiants")
    @JsonProperty
    Set<Reservation> reservations;
}