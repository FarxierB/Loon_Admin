package sr.unasat.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "WerknemerDetail")
public class WerknemerDetail {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String adress;

    @Column
    private int telefoon;

    @Column
    private LocalDate geboorteDatum;

    @OneToOne
    @JoinColumn(name = "Werknemer_ID")
    private Werknemer werknemerId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(int telefoon) {
        this.telefoon = telefoon;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public Werknemer getWerknemerId() {
        return werknemerId;
    }

    public void setWerknemerId(Werknemer werknemerId) {
        this.werknemerId = werknemerId;
    }
}
