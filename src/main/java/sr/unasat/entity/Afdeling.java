package sr.unasat.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Afdeling")
public class Afdeling {
    @Id
    @GeneratedValue
    @Column
    private int Id;

    @Column
    private String AfdelingNaam;

    @OneToMany (mappedBy = "Afdeling")
    private Set<Functie> functies = new HashSet<>();


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAfdelingNaam() {
        return AfdelingNaam;
    }

    public void setAfdelingNaam(String afdelingNaam) {
        AfdelingNaam = afdelingNaam;
    }

    public Set<Functie> getFuncties() {
        return functies;
    }

    public void setFuncties(Functie functie) {
        this.functies.add(functie);
    }
}
