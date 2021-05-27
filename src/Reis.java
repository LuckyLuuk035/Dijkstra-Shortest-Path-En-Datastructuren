import java.util.*;

public class Reis implements Comparable<Stap>{
    private int afstanden[]; // Afstanden.
    private int s; // Aantal Stappen.
    private Set<Integer> bepaalde; // Vast gezette Stappen.
    private PriorityQueue<Stap> pq; // De priority queue van de Stappen.
    List<List<Stap>> naasten; // Lijst van aanliggende.

    public Reis(int s) {
        this.s = s;
        afstanden = new int[s];
        bepaalde = new HashSet<Integer>();
        pq = new PriorityQueue<Stap>(s, new Stap());
    }

    public void algoritme(List<List<Stap>> naasten, int begin) {
        this.naasten = naasten;

        // Voor het algoritme van dijkstra moet je eerst alle afstanden naar oneindig zetten.
        for (int i = 0; i < s; i++)
            afstanden[i] = Integer.MAX_VALUE; // Daardoor zetten we ze hier eerst als de hoogst mogelijk hoeveelheid.

        // Maak het begin punt aan.
        pq.add(new Stap(begin, 0));
        afstanden[begin] = 0; // De afstand tot het begin is altijd 0.

        while (bepaalde.size() != s) { // Zolang niet alle Stappen zijn geweest

            // Haal de minimale afstand van de queue weg.
            int h = pq.remove().stap;


            // En voeg deze weer toe aan de bepaalde.
            bepaalde.add(h);
        }
    }

    private void naastenVerwerken(int h) {
        int afstand = 0;
        int nieuweAfstand = 0;

        // Voor alle naasten.
        for (int i = 0; i < naasten.get(h).size(); i++) {
            Stap huidige = naasten.get(h).get(i);

            // Als de huidige al is geweest ga door naar volgende.
            if (bepaalde.contains(huidige.stap)) {
                continue;
            }

            afstand = huidige.afstand;
            nieuweAfstand = afstanden[h] + afstand;
        }
    }
}

