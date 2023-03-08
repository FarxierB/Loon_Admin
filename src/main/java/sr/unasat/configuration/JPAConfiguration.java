package sr.unasat.configuration;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConfiguration {
    private static final String PERSISTENCE_UNIT_NAME = "sr.unasat_persistence";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static EntityManager em = emf.createEntityManager();

    public static EntityManagerFactory getEmf() {return emf;}

    public static EntityManager getEm() {
        return em;
    }

    public static void setEmf(EntityManagerFactory emf) {JPAConfiguration.emf = emf;}

    public static void shutdown(){
        if(em != null){
            em.close();
        }
        if(emf != null){
            emf.close();
        }
    }
}
