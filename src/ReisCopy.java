//import java.util.HashSet;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Set;
//
//public class ReisCopy implements Comparable<ReisCopy>{
//    public int afstanden[]; // Afstanden.
//    private int s; // Aantal Stappen.
//    private Set<Integer> bepaalde; // Vast gezette Stappen.
//    private PriorityQueue<Stap> pq; // De priority queue van de Stappen.
//    List<List<Stap>> stappenLst; // Lijst van aanliggende.
//
//    public ReisCopy(int s) {
//        this.s = s;
//        afstanden = new int[s];
//        bepaalde = new HashSet<Integer>();
//        pq = new PriorityQueue<Stap>(s, new Stap());
//    }
//
//    public void algoritme(List<List<Stap>> stappenLst, int begin) {
//        this.stappenLst = stappenLst;
//
//        // Voor het algoritme van dijkstra moet je eerst alle afstanden naar oneindig zetten.
//        for (int i = 0; i < s; i++)
//            afstanden[i] = Integer.MAX_VALUE; // Daardoor zetten we ze hier eerst als de hoogst mogelijk hoeveelheid.
//
//        // Maak het begin punt aan.
//        pq.add(new Stap(begin, 0));
//        afstanden[begin] = 0; // De afstand tot het begin is altijd 0.
//
//        while (bepaalde.size() != s) { // Zolang niet alle Stappen zijn geweest
//
//            // Haal de minimale afstand van de queue weg.
//            int h = pq.remove().stap;
//
//            // Verwerk de naasten om de priority queue uit te breiden.
//            naastenVerwerken(h);
//
//            // En voeg deze weer toe aan de bepaalde.
//            bepaalde.add(h);
//        }
//    }
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
//    @Override
//    public int compareTo(ReisCopy o) {
//        if (o1.waarde < o2.waarde)
//            return -1;
//        if (o1.waarde > o2.waarde)
//            return 1;
//        return 0;
//    }
//}
//
//// public class SnelsteRoute implements Comparable<Stap> {
////    public int compareTo(Stap o1, Stap o2) {
////        return 0;
////    }
////}