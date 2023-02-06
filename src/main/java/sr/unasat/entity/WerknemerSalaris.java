package sr.unasat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "WerknemerSalaris")
public class WerknemerSalaris {
    @Id
    @GeneratedValue
    private int Id;

    private String Maand;
    private double AantalUren;
    private double Uurloon;
    private double Salaris;


    @ManyToOne
    @JoinColumn(name = "Werknemer_ID")
    private Werknemer werknemerId;


    public WerknemerSalaris(int id, String maand, double aantalUren, double uurloon, double salaris, Werknemer werknemerId) {
        Id = id;
        Maand = maand;
        AantalUren = aantalUren;
        Uurloon = uurloon;
        Salaris = salaris;
        this.werknemerId = werknemerId;
    }

    public WerknemerSalaris() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMaand() {
        return Maand;
    }

    public void setMaand(String maand) {
        Maand = maand;
    }

    public double getAantalUren() {
        return AantalUren;
    }

    public void setAantalUren(double aantalUren) {
        AantalUren = aantalUren;
    }

    public double getSalaris() {
        return Salaris;
    }

    public void setSalaris(double salaris) {
        Salaris = salaris;
    }

    public double getUurloon() {return Uurloon;}

    public void setUurloon(double uurloon) {Uurloon = uurloon;}

    public Werknemer getWerknemerId() {
        return werknemerId;
    }

    public void setWerknemerId(Werknemer werknemerId) {
        this.werknemerId = werknemerId;
    }





}

