package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return null;
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return null;
    }

    @Override
    public void removeBloc(Long blocId) {

    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return null;
    }
}
