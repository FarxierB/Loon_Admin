package sr.unasat.service;

import sr.unasat.config.JPAConfiguration;
import sr.unasat.entity.InlogWerknemer;
import sr.unasat.entity.Werknemer;
import sr.unasat.repository.InlogRepository;

import java.util.List;

public class InlogService {
    private final InlogRepository repository;

    public InlogService() {
        this.repository = new InlogRepository(JPAConfiguration.getEntityManager());
    }

    public InlogWerknemer addInlogGegevens(InlogWerknemer inlogWerknemer) {
        return repository.addInlogGegevens(inlogWerknemer);
    }

    public InlogWerknemer updateInlogGegevens(InlogWerknemer inlogWerknemer) { return repository.updateInlogGegevens(inlogWerknemer);}

    public InlogWerknemer deleteInlogGegevens(InlogWerknemer inlogWerknemer) { return repository.deleteInlogGegevens(inlogWerknemer);}

    public List<InlogWerknemer> getInlog() {return repository.getInlog();}

}
