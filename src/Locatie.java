import java.util.ArrayList;
import java.util.List;

public class Locatie {
    private String naam;
    private List<Stap> transities;

    public Locatie(String naam) {
        this.naam = naam;
        this.transities = new ArrayList<Stap>();
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
}
