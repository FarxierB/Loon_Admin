package sr.unasat.repository;

import sr.unasat.entity.Werknemer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class WerknemerRepository {

    private EntityManager entityManager;


    public WerknemerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Werknemer> getWerknemers() {
        entityManager.getTransaction().begin();
        String query = "select w from Werknemer w";
        TypedQuery<Werknemer> typedQuery = entityManager.createQuery(query, Werknemer.class);
        List<Werknemer> dienstList = typedQuery.getResultList();
        entityManager.getTransaction().commit();
        return dienstList;
    }


    public Werknemer getWerknemer(int Id){
        entityManager.getTransaction().begin();
        String query = "Select w from Werknemer w where w.id = :werknemer_id";
        TypedQuery<Werknemer> typedQuery = entityManager.createQuery(query, Werknemer.class);
        typedQuery.setParameter("werknemer_id", Id);
        Werknemer werknemer = typedQuery.getSingleResult();
        entityManager.getTransaction().commit();
        return werknemer;
    }

  //  public Werknemer getWerknemer(int id){return entityManager.find(Werknemer.class, id);}


    public Werknemer addWerknemer(Werknemer werknemer){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(werknemer);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return werknemer;
    }



    public Werknemer deleteWerknemer(Werknemer werknemer){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Werknemer.class, werknemer.getId());
            if(werknemer != null)  entityManager.remove(werknemer);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werknemer;
    }


    public Werknemer updateWerknemer(Werknemer werknemer){
        try{
            entityManager.getTransaction().begin();
/*            String findQuery = "from Gebruiker where id = :gebruiker_id";
            Query query = entityManager.createQuery(findQuery);
            query.setParameter("gebruiker_id", gebruiker.getId());*/
            entityManager.find(Werknemer.class, werknemer.getId());
            entityManager.merge(werknemer);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werknemer;
    }


}
