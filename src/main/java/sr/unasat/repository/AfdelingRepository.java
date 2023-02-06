package sr.unasat.repository;

import sr.unasat.entity.Afdeling;
import sr.unasat.entity.Werknemer;
import jakarta.persistence.EntityManager;

public class AfdelingRepository {
    private EntityManager entityManager;


    public AfdelingRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public Afdeling addAfdeling(Afdeling afdeling){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(afdeling);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return afdeling;
    }

    public Afdeling deleteAfdeling(Afdeling afdeling){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Werknemer.class, afdeling.getId());
            if(afdeling != null)  entityManager.remove(afdeling);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return afdeling;
    }


    public Afdeling updateAfdeling(Afdeling afdeling){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Werknemer.class, afdeling.getId());
            entityManager.merge(afdeling);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return afdeling;
    }
}
