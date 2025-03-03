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
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@JsonProperty
        Long idFoyer;
    @JsonProperty
     String nomFoyer;
    @JsonProperty
     Long capaciteFoyer;
     @OneToOne(mappedBy = "foyer")
     @JsonProperty
    Universite universite;
     @OneToMany(cascade = CascadeType.ALL)
     @JsonProperty
     Set<Bloc> blocs;
}