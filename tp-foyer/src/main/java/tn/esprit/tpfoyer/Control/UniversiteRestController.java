package tn.esprit.tpfoyer.Control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    @Autowired
     IUniversiteService universiteService;
    @GetMapping("/retrieve-all-universite")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrievefoyer(@PathVariable("universite-id") Long foyId) {
        return universiteService.retrieveUniversite(foyId);
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long unId) {
        universiteService.removeUniversite(unId);
    }

    @PutMapping("/modify-universite")
    public Universite modifyEtudiant(@RequestBody Universite u) {
        return universiteService.modifyUniversite(u);
    }
}
