package sr.unasat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Werknemer")
public class Werknemer {
    @Id
    @GeneratedValue
    private int Id;
    private String Voornaam;
    private String Achternaam;
    private String Email;

    @ManyToMany
    @JoinTable(name = "Werknemer_Rol", joinColumns = {@JoinColumn(name = "Werknemer_ID")}, inverseJoinColumns = {@JoinColumn(name = "Functie_ID")})
    private Set<Functie> functies = new HashSet<>();




    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String voornaam) {
        Voornaam = voornaam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String achternaam) {
        Achternaam = achternaam;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Set<Functie> getFuncties() {
        return functies;
    }

    public void setFuncties(Functie functie) {
        this.functies.add(functie);
    }
}
