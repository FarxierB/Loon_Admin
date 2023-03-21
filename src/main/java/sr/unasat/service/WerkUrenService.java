package sr.unasat.service;

import sr.unasat.config.JPAConfiguration;
import sr.unasat.entity.WerkUren;
import sr.unasat.repository.WerkUrenRepository;

import java.util.List;

public class WerkUrenService {

    private final WerkUrenRepository repository;

    public WerkUrenService() {
        this.repository = new WerkUrenRepository(JPAConfiguration.getEntityManager());
    }

    public List<WerkUren> getWerkUrenLijst() {
        return repository.getWerkUrenLijst();
    }

    public WerkUren getWerkUren(WerkUren werkUren){return repository.getWerkUren(werkUren);}

    public WerkUren addWerkUren(WerkUren werkUren) {
        return repository.addWerkUren(werkUren);
    }

    public WerkUren updateWerkUren(WerkUren werkUren) { return repository.updateWerkUren(werkUren);}

    public WerkUren deleteWerkUren(WerkUren werkUren) { return repository.deleteWerkUren(werkUren);}
}
