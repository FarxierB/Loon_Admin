package sr.unasat.dto;

import sr.unasat.entity.Functie;
import sr.unasat.entity.Werknemer;

import java.util.Set;

public class WerknemerDTO {
    private int id;

    private String voornaam;

    private String achternaam;

    private String email;

    private Set<Functie> functies;

    public static class WerknemerDTOBuilder {
        private int Id;
        private String Voornaam;
        private String Achternaam;
        private String Email;
        private Set<Functie> functies;


        public WerknemerDTOBuilder() {
        }

        public WerknemerDTOBuilder Id(int id) {
            this.Id = id;
            return this;
        }


        public WerknemerDTOBuilder Voornaam(String voornaam){
            this.Voornaam = voornaam;
            return this;
        }

        public WerknemerDTOBuilder Achternaam(String achternaam){
            this.Achternaam = achternaam;
            return this;
        }

        public WerknemerDTOBuilder Email(String email){
            this.Email = email;
            return this;
        }

        public WerknemerDTOBuilder functies (Set<Functie> functies){
            this.functies = functies;
            return this;
        }

        public WerknemerDTO build(){
            return new WerknemerDTO(this);
        }
    }

    public WerknemerDTO(){}

    public WerknemerDTO (WerknemerDTOBuilder werknemerDTOBuilder){
        this.id = werknemerDTOBuilder.Id;
        this.voornaam = werknemerDTOBuilder.Voornaam;
        this.achternaam = werknemerDTOBuilder.Achternaam;
        this.email = werknemerDTOBuilder.Email;
        this.functies = werknemerDTOBuilder.functies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Functie> getFuncties() {
        return functies;
    }

    public void setFuncties(Set<Functie> functies) {
        this.functies = functies;
    }
}
