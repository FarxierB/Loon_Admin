package sr.unasat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "WerkUren")
public class WerkUren {
    @Id
    @GeneratedValue
    @Column
    private int Id;

    @Column
    private String Maand;

    @Column
    private double AantalUren;

    @Column
    private double Uurloon;

    @ManyToOne
    @JoinColumn(name = "Werknemer_ID")
    private Werknemer werknemerId;


    public WerkUren(int id, String maand, double aantalUren, double uurloon, Werknemer werknemerId) {
        Id = id;
        Maand = maand;
        AantalUren = aantalUren;
        Uurloon = uurloon;
        this.werknemerId = werknemerId;
    }

    public WerkUren() {

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

    public double getUurloon() {return Uurloon;}

    public void setUurloon(double uurloon) {Uurloon = uurloon;}

    public Werknemer getWerknemerId() {
        return werknemerId;
    }

    public void setWerknemerId(Werknemer werknemerId) {
        this.werknemerId = werknemerId;
    }





}

