package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {
    public UniversiteRepository universiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteid) {return universiteRepository.findById(universiteid).get();}

    public Universite addUniversite(Universite u) { return universiteRepository.save(u);}
    public void removeUniversite(Long universiteid) {
        universiteRepository.deleteById(universiteid);
    }
    public Universite modifyUniversite(Universite foyer) {
        return universiteRepository.save(foyer);
    }
}
