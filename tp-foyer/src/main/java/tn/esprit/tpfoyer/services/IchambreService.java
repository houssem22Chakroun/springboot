package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;

public interface IchambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
