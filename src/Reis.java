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
        pq = new PriorityQueue<Locatie>();
    }

    public void setLocatie(List<Locatie> locaties) {
        Reis.locaties = locaties;
    }

    public List<Locatie> getLocaties() {
        return locaties;
    }

// Het probleem zit als het goed is in het kiezen van de volgende vector!!!
    public void run() {
        start.setWaarde(0);

        pq.addAll(locaties); // Voeg alle locaties toe aan de PriorityQueue.
        System.out.println(pq);

        while (bepaalde.size() != locaties.size()) { // Zolang niet alle locaties vast staan.

            // Haal de minimale afstand van de queue weg.
            Locatie front = pq.remove();

            updateWaardes(front);

            // En voeg deze weer toe aan de bepaalde.
            //bepaalde.add(h);
        }
    }

    public void updateWaardes(Locatie locatie) {
        for (Stap stap : locatie.getTransities()) {
            // Als de waarde van de bestemming groter is dan die van de huidige locatie en stap bij elkaar.
            int nOptie = locatie.getWaarde() + stap.getAfstand();
            if (stap.getBestemming().getWaarde() > nOptie) {
                stap.getBestemming().setWaarde(nOptie);
            }
        }
        bepaalde.add(locatie.getWaarde());
    }
}
//
//    private void naastenVerwerken(int h) {
//        int afstand = 0;
//        int nieuweAfstand = 0;
//
//        // Voor alle aanliggende.
//        for (int i = 0; i < stappenLst.get(h).size(); i++) {
//            Stap huidige = stappenLst.get(h).get(i);
//
//            // Als de huidige al is geweest ga door naar volgende.
//            if (bepaalde.contains(huidige.stap)) {
//                continue;
//            }
//
//            afstand = huidige.waarde;
//            nieuweAfstand = afstanden[h] + afstand;
//
//            // Als de nieuwe afstand minder is dan de vorige afstand.
//            if (nieuweAfstand < afstanden[huidige.stap]){
//                afstanden[huidige.stap] = nieuweAfstand;
//            }
//
//            // En voeg tot slot de stap met nieuwe waarde toe aan de queue.
//            pq.add(new Stap(huidige.stap, afstanden[huidige.stap]));
//        }
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//

