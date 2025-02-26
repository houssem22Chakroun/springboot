package tn.esprit.tpfoyer.entity;

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
     Long idFoyer;
     String nomFoyer;
     Long capaciteFoyer;
     @OneToOne(mappedBy = "foyer")
    Universite universite;
     @OneToMany(cascade = CascadeType.ALL)
     Set<Bloc> blocs;
}