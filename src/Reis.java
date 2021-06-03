import java.util.*;

public class Reis{
    private List<Integer> afstanden;
    private Locatie start; // Het begin punt van de reis.
    private Locatie eind; // Het eind punt van de reis.
    private static List<Locatie> locaties;

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


    public void algoritme() {
        start.setWaarde(0);

        // Voeg alle locaties toe aan de PriorityQueue.
//        for(Locatie locatie: locaties){
        pq.addAll(locaties);


        System.out.println(afstanden);
        while (bepaalde.size() != locaties.size()) { // Zolang niet alle locaties vast staan.

            // Haal de minimale afstand van de queue weg.
            List<Stap> h = pq.remove().getTransities();
            System.out.println(h);
            break;
            // Verwerk de naasten om de priority queue uit te breiden.
//            naastenVerwerken(h);

            // En voeg deze weer toe aan de bepaalde.
            //bepaalde.add(h);
        }
    }

    // Compare two employee objects by their salary

//        for (Locatie o2 : this.pq) {
//            if (o1.waarde < o2.waarde) {
//                return -1;
//            }
//            if (o1.waarde > o2.waarde) {
//                return 1;
//            }
//            return 0;
//        }
//        return 0;
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

