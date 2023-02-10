package sr.unasat.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Functie")
public class Functie {
    @Id
    @GeneratedValue
    private int Id;

    private String functie;

    @ManyToOne
    @JoinColumn(name = "Afdeling_ID")
    private Afdeling Afdeling;

    @ManyToMany (mappedBy = "functies")
    private Set<Werknemer> werknemers = new HashSet<>();

    public Functie(){
    }



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
        return Afdeling;
    }

    public void setAfdeling(sr.unasat.entity.Afdeling afdeling) {
        Afdeling = afdeling;
    }

    public Set<Werknemer> getWerknemers() {
        return werknemers;
    }

    public void setWerknemers(Set<Werknemer> werknemers) {
        this.werknemers = werknemers;
    }
}
