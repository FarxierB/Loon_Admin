package sr.unasat.service;

import sr.unasat.configuration.JPAConfiguration;
import sr.unasat.entity.InlogWerknemer;
import sr.unasat.repository.InlogRepository;

public class InlogService {
    private final InlogRepository repository;

    public InlogService() {
        this.repository = new InlogRepository(JPAConfiguration.getEm());
    }

    public InlogWerknemer addInlogGegevens(InlogWerknemer inlogWerknemer) {
        return repository.addInlogGegevens(inlogWerknemer);
    }

    public InlogWerknemer updateInlogGegevens(InlogWerknemer inlogWerknemer) { return repository.updateInlogGegevens(inlogWerknemer);}

    public InlogWerknemer deleteInlogGegevens(InlogWerknemer inlogWerknemer) { return repository.deleteInlogGegevens(inlogWerknemer);}
}
