package sr.unasat.repository;

import sr.unasat.entity.WerkUren;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class WerkUrenRepository {


    private EntityManager entityManager;


    public WerkUrenRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<WerkUren> getWerkUrenLijst() {
        String query = "select g from WerkUren g";
        TypedQuery<WerkUren> typedQuery = entityManager.createQuery(query, WerkUren.class);
        List<WerkUren> UrenList = typedQuery.getResultList();
        return UrenList;
    }


    public WerkUren getWerkUren(WerkUren werkUren){
        String query = "Select w from WerkUren w where w.id = :WerkUren_id";
        TypedQuery<WerkUren> typedQuery = entityManager.createQuery(query, WerkUren.class);
        typedQuery.setParameter("WerkUren_id", werkUren.getId());
        return typedQuery.getSingleResult();
    }



    public WerkUren addWerkUren(WerkUren werkUren){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(werkUren);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return werkUren;
    }



    public WerkUren deleteWerkUren(WerkUren werkUren){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(WerkUren.class, werkUren.getId());
            if(werkUren != null)  entityManager.remove(werkUren);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werkUren;
    }


    public WerkUren updateWerkUren(WerkUren werkUren){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(WerkUren.class, werkUren.getId());
            entityManager.merge(werkUren);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werkUren;
    }

}
