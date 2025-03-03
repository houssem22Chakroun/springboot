
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
public class Bloc {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @JsonProperty
     Long idBloc;
    @JsonProperty
     String nomBloc;
    @JsonProperty
     Long capaciteBloc;
     @ManyToOne
     @JsonProperty
    Foyer foyer;
    @JsonProperty
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    Set<Chambre> chambres;
}