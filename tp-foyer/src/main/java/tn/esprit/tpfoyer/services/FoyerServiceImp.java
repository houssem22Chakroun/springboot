package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImp implements IFoyerService{
    public FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long foyerid) {return foyerRepository.findById(foyerid).get();}

    public Foyer addFoyer(Foyer f) { return foyerRepository.save(f);}
    public void removeFoyer(Long foyerid) {
        foyerRepository.deleteById(foyerid);
    }
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
