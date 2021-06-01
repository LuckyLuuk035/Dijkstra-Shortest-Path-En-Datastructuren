import java.util.Comparator;

public class Stap implements Comparable<Stap> {
    private Locatie bestemming;
    private int waarde;

    public Stap(Locatie bestemming, int afstand) {
        this.bestemming = bestemming;
        this.waarde = afstand;
    }

    public Locatie getBestemming() {
        return bestemming;
    }

    public void setBestemming(Locatie bestemming) {
        this.bestemming = bestemming;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }
}


