package sr.unasat.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Afdeling")
public class Afdeling {
    @Id
    @GeneratedValue
    private int Id;

    private String AfdelingNaam;

    @OneToMany (mappedBy = "Afdeling")
    private List<Functie> functies = new ArrayList<>();


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

    public List<Functie> getFuncties() {
        return functies;
    }

    public void setFuncties(Functie functie) {
        functies.add(functie);
    }
}
