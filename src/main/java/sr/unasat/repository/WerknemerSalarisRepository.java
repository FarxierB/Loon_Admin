package sr.unasat.repository;

import sr.unasat.entity.WerknemerSalaris;
import sr.unasat.strategy.SalarisBerekeningen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class WerknemerSalarisRepository implements SalarisBerekeningen {


    private EntityManager entityManager;


    public WerknemerSalarisRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<WerknemerSalaris> getWerknemerSalarisLijst() {
        String query = "select g from WerknemerSalaris g";
        TypedQuery<WerknemerSalaris> typedQuery = entityManager.createQuery(query, WerknemerSalaris.class);
        List<WerknemerSalaris> UrenList = typedQuery.getResultList();
        return UrenList;
    }


    public WerknemerSalaris getWerknemerSalaris(WerknemerSalaris werknemerSalaris){
        String query = "Select w from WerknemerSalaris w where w.id = :werknemerSalaris_id";
        TypedQuery<WerknemerSalaris> typedQuery = entityManager.createQuery(query, WerknemerSalaris.class);
        typedQuery.setParameter("werknemerSalaris_id", werknemerSalaris.getId());
        return typedQuery.getSingleResult();
    }



    public WerknemerSalaris addWerknemerSalaris(WerknemerSalaris werknemerSalaris){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(werknemerSalaris);
            entityManager.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return werknemerSalaris;
    }



    public WerknemerSalaris deleteWerknemerSalaris(WerknemerSalaris werknemerSalaris){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(WerknemerSalaris.class, werknemerSalaris.getId());
            if(werknemerSalaris != null)  entityManager.remove(werknemerSalaris);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werknemerSalaris;
    }


    public WerknemerSalaris updateWerknemerSalaris(WerknemerSalaris werknemerSalaris){
        try{
            entityManager.getTransaction().begin();
            entityManager.find(WerknemerSalaris.class, werknemerSalaris.getId());
            entityManager.merge(werknemerSalaris);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return werknemerSalaris;
    }


    @Override
    public double Berekening(double uurLoon, double urenGewerkt) {
        return uurLoon * urenGewerkt;
    }
}
