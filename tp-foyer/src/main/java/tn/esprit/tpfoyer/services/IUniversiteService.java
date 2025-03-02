package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long foyerId);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long universiteid);
    public Universite modifyUniversite(Universite universite);
}
