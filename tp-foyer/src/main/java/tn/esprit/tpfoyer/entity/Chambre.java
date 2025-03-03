package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
     Long idChambre;
    @JsonProperty
     Long numeroChambre;
    @Enumerated(EnumType.STRING)
    @JsonProperty
     TypeChambre typeC;
    @ManyToOne
    @JsonProperty
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonProperty
    Set<Reservation> reservations;
}