package sr.unasat.service;

import sr.unasat.config.JPAConfiguration;
import sr.unasat.entity.Werknemer;
import sr.unasat.repository.WerknemerRepository;

import java.util.List;

public class WerknemerService {

    private final WerknemerRepository werknemerRepository;

    public WerknemerService() {this.werknemerRepository = new WerknemerRepository(JPAConfiguration.getEntityManager());}

    public List<Werknemer> getWerknemers() {return werknemerRepository.getWerknemerList();}

    public Werknemer getWerknemer(int Id){return werknemerRepository.getWerknemer(Id);}

    public Werknemer addWerknemer(Werknemer werknemer) {return werknemerRepository.addWerknemer(werknemer);}

    public Werknemer updateWerknemer(Werknemer werknemer) { return werknemerRepository.updateWerknemer(werknemer);}

    public Werknemer deleteWerknemer(Werknemer werknemer) { return werknemerRepository.deleteWerknemer(werknemer);}
}
