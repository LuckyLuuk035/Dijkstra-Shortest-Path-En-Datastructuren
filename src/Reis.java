import java.util.*;

public class Reis {
    private List<Integer> afstanden;
    private Locatie start; // Het begin punt van de reis.
    private Locatie eind; // Het eind punt van de reis.
    private static List<Locatie> locaties;

    // Bepaalde kan ook vervangen worden door een counter.
    private Set<Integer> bepaalde; // Vast gezette Stappen.
    private PriorityQueue<Locatie> pq; // De priority queue van de locaties.

    public Reis(Locatie start, Locatie eind) {
        this.start = start;
        this.eind = eind;
        bepaalde = new HashSet<Integer>();
        pq = new PriorityQueue<Locatie>(Locatie::compareTo);
    }

    public void setLocatie(List<Locatie> locaties) {
        Reis.locaties = locaties;
    }

    public List<Locatie> getLocaties() {
        return locaties;
    }

    // Het probleem zit als het goed is in het kiezen van de volgende vector!!!
    public String run() {
        start.setWaarde(0);
        
        pq.addAll(locaties); // Voeg alle locaties toe aan de PriorityQueue.
        System.out.println(pq);

        while (bepaalde.size() != locaties.size()) { // Zolang niet alle locaties vast staan.

            // Haal de minimale afstand van de queue weg.
            // Ik weet dat het niet zo moet maar kon de correcte oplossing niet vinden dus doe het zo.

            Locatie front = pq.remove();

            updateWaardes(front);

            // En voeg deze weer toe aan de bepaalde.
            //bepaalde.add(h);
        }
        return this.toString();
    }

    public void updateWaardes(Locatie locatie) {
        for (Stap stap : locatie.getTransities()) {
            // Als de waarde van de bestemming groter is dan die van de huidige locatie en stap bij elkaar.
            int nOptie = locatie.getWaarde() + stap.getAfstand();
            if (stap.getBestemming().getWaarde() > nOptie) {
                stap.getBestemming().setWaarde(nOptie);
            }
        }
        if(bepaalde.contains(locatie.getWaarde())) {
            return;
        }
        pq.add(locatie);
        bepaalde.add(locatie.getWaarde());
    }

    @Override
    public String toString() {
        return "De reis van" +
                " start: " + start +
                " tot eind: " + eind +
                " is " + eind.getWaarde() +
                " lang.";
    }
}