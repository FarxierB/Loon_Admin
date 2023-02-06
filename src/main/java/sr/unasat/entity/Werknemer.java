package sr.unasat.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    private List<Functie> functies = new ArrayList<>();


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

    public List<Functie> getFuncties() {
        return functies;
    }

    public void setFuncties(List<Functie> functies) {
        this.functies = functies;
    }
}
