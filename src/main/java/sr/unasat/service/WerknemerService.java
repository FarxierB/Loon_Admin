package sr.unasat.service;

import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.Werknemer;
import sr.unasat.repository.WerknemerRepository;

import java.util.List;

public class WerknemerService {

    private final WerknemerRepository repository;

    public WerknemerService() {this.repository = new WerknemerRepository(JPAConfiguration.getEm());}

    public List<Werknemer> getWerknemers() {return repository.getWerknemers();}

    public Werknemer getWerknemer(int Id){return repository.getWerknemer(Id);}

    public Werknemer addWerknemer(Werknemer werknemer) {return repository.addWerknemer(werknemer);}

    public Werknemer updateWerknemer(Werknemer werknemer) { return repository.updateWerknemer(werknemer);}

    public Werknemer deleteWerknemer(Werknemer werknemer) { return repository.deleteWerknemer(werknemer);}
}
