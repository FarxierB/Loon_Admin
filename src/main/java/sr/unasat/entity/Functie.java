package sr.unasat.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    private List<Werknemer> werknemers = new ArrayList<>();

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


    public sr.unasat.entity.Afdeling getAfdeling() {
        return Afdeling;
    }

    public void setAfdeling(sr.unasat.entity.Afdeling afdeling) {
        Afdeling = afdeling;
    }

    public List<Werknemer> getWerknemers() {
        return werknemers;
    }

    public void setWerknemers(List<Werknemer> werknemers) {
        this.werknemers = werknemers;
    }
}
