import java.util.*;

public class Reis implements Comparable<Stap>{
    private int dist[]; // Afstanden.
    private int s; // Aantal Stappen.
    private Set<Integer> bepaalde; // Vast gezette Stappen.
    private PriorityQueue<Stap> pq; // De priority queue van de Stappen.
    List<List<Stap>> naasten; // Lijst van aanliggende.

    public Reis(int s) {
        this.s = s;
        dist = new int[s];
        bepaalde = new HashSet<Integer>();
        pq = new PriorityQueue<Stap>(s, new Stap());
    }

    public void algoritme(List<List<Stap>> naasten, int begin) {
        this.naasten = naasten;

        // Voor het algoritme van dijkstra moet je eerst alle afstanden naar oneindig zetten.
        for (int i = 0; i < s; i++)
            dist[i] = Integer.MAX_VALUE; // Daardoor zetten we ze hier eerst als de hoogst mogelijk hoeveelheid.

        // Maak het begin punt aan.
        pq.add(new Stap(begin, 0));
        dist[begin] = 0; // De afstand tot het begin is altijd 0.

        while (bepaalde.size() != s) { // Zolang niet alle Stappen zijn geweest

            // Haal de minimale afstand van de queue weg.
            int c = pq.remove().naar;
            
            // En voeg deze weer toe aan de bepaalde.
            bepaalde.add(c);
        }
    }
}
