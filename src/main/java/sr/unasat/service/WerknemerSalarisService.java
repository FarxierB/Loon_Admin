package sr.unasat.service;

import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.WerknemerSalaris;
import sr.unasat.repository.WerknemerSalarisRepository;

import java.util.List;

public class WerknemerSalarisService {

    private final WerknemerSalarisRepository repository;

    public WerknemerSalarisService() {
        this.repository = new WerknemerSalarisRepository(JPAConfiguration.getEm());
    }

    public List<WerknemerSalaris> getWerknemerSalarisLijst() {
        return repository.getWerknemerSalarisLijst();
    }

    public WerknemerSalaris getWerknemerSalaris(WerknemerSalaris werknemerSalaris){return repository.getWerknemerSalaris(werknemerSalaris);}

    public WerknemerSalaris addWerknemerSalaris(WerknemerSalaris werknemerSalaris) {
        return repository.addWerknemerSalaris(werknemerSalaris);
    }

    public WerknemerSalaris updateWerknemerSalaris(WerknemerSalaris werknemerSalaris) { return repository.updateWerknemerSalaris(werknemerSalaris);}

    public WerknemerSalaris deleteWerknemerSalaris(WerknemerSalaris werknemerSalaris) { return repository.deleteWerknemerSalaris(werknemerSalaris);}
}
