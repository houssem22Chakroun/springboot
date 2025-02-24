package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long chambreId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
