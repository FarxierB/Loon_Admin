package sr.unasat.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import sr.unasat.entity.InlogWerknemer;
import sr.unasat.entity.Werknemer;

import java.util.List;

public class InlogRepository {

    private EntityManager entityManager;


    public InlogRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    public InlogWerknemer addInlogGegevens(InlogWerknemer inlogWerknemer){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(inlogWerknemer);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return inlogWerknemer;
    }



    public InlogWerknemer deleteInlogGegevens(InlogWerknemer inlogWerknemer){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(InlogWerknemer.class, inlogWerknemer.getId());
            if(inlogWerknemer != null)  entityManager.remove(inlogWerknemer);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return inlogWerknemer;
    }


    public InlogWerknemer updateInlogGegevens(InlogWerknemer inlogWerknemer){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(InlogWerknemer.class, inlogWerknemer.getId());
            entityManager.merge(inlogWerknemer);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return inlogWerknemer;
    }

    public List<InlogWerknemer> getInlog() {
        entityManager.getTransaction().begin();
        String query = "select w from InlogWerknemer w";
        TypedQuery<InlogWerknemer> typedQuery = entityManager.createQuery(query, InlogWerknemer.class);
        List<InlogWerknemer> inlogList = typedQuery.getResultList();
        entityManager.getTransaction().commit();
        return inlogList;
    }
}
