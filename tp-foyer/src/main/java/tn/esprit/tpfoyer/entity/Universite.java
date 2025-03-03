package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
     Long idUniversite;
    @JsonProperty
     String nomUniversite;
    @JsonProperty
     String adresse;
    @JsonProperty
     @OneToOne
     Foyer foyer;
}