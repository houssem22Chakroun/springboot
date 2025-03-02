package tn.esprit.tpfoyer.Control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    @Autowired
     public IFoyerService foyerService;
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrievefoyer(@PathVariable("foyer-id") Long foyId) {
        return foyerService.retrieveFoyer(foyId);
    }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyId) {
        foyerService.removeFoyer(foyId);
    }

    @PutMapping("/modify-foyer")
    public Foyer modifyEtudiant(@RequestBody Foyer f) {
        return foyerService.modifyFoyer(f);
    }
}
