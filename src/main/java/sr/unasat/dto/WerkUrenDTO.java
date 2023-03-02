package sr.unasat.dto;

import sr.unasat.entity.Werknemer;

public class WerkUrenDTO {
    private int id;

    private String maand;

    private double aantalUren;

    private double uurLoon;

    private Werknemer werknemerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaand() {
        return maand;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public double getAantalUren() {
        return aantalUren;
    }

    public void setAantalUren(double aantalUren) {
        this.aantalUren = aantalUren;
    }

    public double getUurLoon() {
        return uurLoon;
    }

    public void setUurLoon(double uurLoon) {
        this.uurLoon = uurLoon;
    }

    public Werknemer getWerknemerId() {
        return werknemerId;
    }

    public void setWerknemerId(Werknemer werknemerId) {
        this.werknemerId = werknemerId;
    }
}
