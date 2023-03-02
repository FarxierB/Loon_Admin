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

    public static class WerknemerBuilder {
        private int Id;
        private String Voornaam;
        private String Achternaam;
        private String Email;
        private Set<Functie> functies;


        public WerknemerBuilder() {
        }

        public WerknemerBuilder Id(int id) {
            this.Id = id;
            return this;
        }


        public WerknemerBuilder Voornaam(String voornaam){
            this.Voornaam = voornaam;
            return this;
        }

        public WerknemerBuilder Achternaam(String achternaam){
            this.Achternaam = achternaam;
            return this;
        }

        public WerknemerBuilder Email(String email){
            this.Email = email;
            return this;
        }

        public WerknemerBuilder functies (Set<Functie> functies){
            this.functies = functies;
            return this;
        }

        public Werknemer build(){
            return new Werknemer(this);
        }
    }
    public Werknemer(){}

    public Werknemer(WerknemerBuilder werknemerBuilder){
        this.Id = werknemerBuilder.Id;
        this.Voornaam = werknemerBuilder.Voornaam;
        this.Achternaam = werknemerBuilder.Achternaam;
        this.Email = werknemerBuilder.Email;
        this.functies = werknemerBuilder.functies;
    }


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
