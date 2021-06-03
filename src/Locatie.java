import java.util.ArrayList;
import java.util.List;

public class Locatie {
    private String naam;
    private List<Stap> transities;
    private int waarde;

    public Locatie(String naam) {
        this.naam = naam;
        this.transities = new ArrayList<Stap>();
    }

    public Locatie() {
        this.waarde = Integer.MAX_VALUE;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<Stap> getTransities() {
        return transities;
    }

    public void setTransities(List<Stap> transities) {
        this.transities = transities;
    }

    public void addTransitie(Stap stap) {
        this.transities.add(stap);
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }
}
