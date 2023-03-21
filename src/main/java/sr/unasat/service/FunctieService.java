package sr.unasat.service;

import sr.unasat.config.JPAConfiguration;
import sr.unasat.entity.Functie;
import sr.unasat.repository.FunctieRepository;

public class FunctieService {

    private final FunctieRepository repository;

    public FunctieService() {
        this.repository = new FunctieRepository(JPAConfiguration.getEntityManager());
    }

    public Functie addFunctie(Functie functie) {
        return repository.addFunctie(functie);
    }

    public Functie updateFunctie(Functie functie) { return repository.updateFunctie(functie);}

    public Functie deleteFunctie(Functie functie) { return repository.deleteFunctie(functie);}
}
