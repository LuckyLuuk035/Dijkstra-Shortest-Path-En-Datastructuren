import java.util.Comparator;

public class Stap implements Comparable<Stap> {
    private Locatie bestemming;
    private int afstand;

    public Stap(Locatie bestemming, int afstand) {
        this.bestemming = bestemming;
        this.afstand = afstand;
    }

    public Locatie getBestemming() {
        return bestemming;
    }

    public void setBestemming(Locatie bestemming) {
        this.bestemming = bestemming;
    }

    public int getAfstand() {
        return afstand;
    }

    public void setAfstand(int afstand) {
        this.afstand = afstand;
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }
}


