package ehb.be.eindproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Artikel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naam;
    private float prijs;
    private String merk;
    private String cat;
    private String beschrijving;
    private int quantiteit;
    private double totalprijs;

    public Artikel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getQuantiteit() {
        return quantiteit;
    }

    public void setQuantiteit(int quantiteit) {
        this.quantiteit = quantiteit;
    }

    public double getTotalprijs() {
        return totalprijs;
    }

    public void setTotalprijs(double totalprijs) {
        this.totalprijs = totalprijs;
    }
}
