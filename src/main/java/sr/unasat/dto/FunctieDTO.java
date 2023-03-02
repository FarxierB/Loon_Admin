package sr.unasat.dto;

import sr.unasat.entity.Afdeling;
import sr.unasat.entity.Werknemer;

import java.util.Set;

public class FunctieDTO {
    private int Id;

    private String functie;

    private Afdeling afdeling;

    private Set<Werknemer> werknemers;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public Set<Werknemer> getWerknemers() {
        return werknemers;
    }

    public void setWerknemers(Set<Werknemer> werknemers) {
        this.werknemers = werknemers;
    }
}
