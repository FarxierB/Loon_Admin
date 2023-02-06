package sr.unasat.repository;

import sr.unasat.entity.Functie;
import jakarta.persistence.EntityManager;

public class FunctieRepository {

    private EntityManager entityManager;


    public FunctieRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    public Functie addFunctie(Functie functie){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(functie);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return functie;
    }



    public Functie deleteFunctie(Functie functie){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Functie.class, functie.getId());
            if(functie != null)  entityManager.remove(functie);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return functie;
    }


    public Functie updateFunctie(Functie functie){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(Functie.class, functie.getId());
            entityManager.merge(functie);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return functie;
    }


}
