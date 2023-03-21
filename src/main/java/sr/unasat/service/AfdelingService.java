package sr.unasat.service;

import sr.unasat.config.JPAConfiguration;
import sr.unasat.entity.Afdeling;
import sr.unasat.repository.AfdelingRepository;

public class AfdelingService {


    private final AfdelingRepository repository;

    public AfdelingService() { this.repository = new AfdelingRepository(JPAConfiguration.getEntityManager()); }

    public Afdeling addAfdeling(Afdeling afdeling) {
        return repository.addAfdeling(afdeling);
    }

    public  Afdeling updateAfdeling(Afdeling afdeling) { return repository.updateAfdeling(afdeling);}

    public Afdeling deleteAfdeling(Afdeling afdeling) { return repository.deleteAfdeling(afdeling);}
}
