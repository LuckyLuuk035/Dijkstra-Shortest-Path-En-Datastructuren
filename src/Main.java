import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int s = 6; // Aantal stappen.
        int begin = 0; // Begin punt.

        // Maak een lijst aan met elke node
        List<List<Stap>> stappenLst = new ArrayList<List<Stap>>();
        for (int i = 0; i <= s; i++) {
            List<Stap> tempLst = new ArrayList<Stap>();
            stappenLst.add(tempLst);
        }

        // Maak de verbindingen. Dit is gedaan op basis van de afbeelding: graph.PNG
        // A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6.

        stappenLst.get(0).add(new Stap(2,3)); // A -> C
        stappenLst.get(0).add(new Stap(5,2)); // A -> F

        stappenLst.get(1).add(new Stap(3,1)); // B -> D
        stappenLst.get(1).add(new Stap(4,1)); // B -> E
        stappenLst.get(1).add(new Stap(6,1)); // B -> G

        stappenLst.get(2).add(new Stap(3,4)); // C -> D
        stappenLst.get(2).add(new Stap(4,1)); // C -> E
        stappenLst.get(2).add(new Stap(5,2)); // C -> F

        stappenLst.get(3).add(new Stap(1,1)); // D -> B
        stappenLst.get(3).add(new Stap(2,4)); // D -> C

        stappenLst.get(4).add(new Stap(1,2)); // E -> B
        stappenLst.get(4).add(new Stap(2,1)); // E -> C
        stappenLst.get(4).add(new Stap(5,3)); // E -> F

        stappenLst.get(5).add(new Stap(0,2)); // F -> A
        stappenLst.get(5).add(new Stap(1,6)); // F -> B
        stappenLst.get(5).add(new Stap(2,2)); // F -> C
        stappenLst.get(5).add(new Stap(4,3)); // F -> E
        stappenLst.get(5).add(new Stap(6,5)); // F -> G

        stappenLst.get(6).add(new Stap(1,1)); // G -> B
        stappenLst.get(6).add(new Stap(5,1)); // G -> F

        // Bereken de korste paden (dit hoeft maar 1x te gebeuren)
        Reis spg = new Reis(s); // Spanning Tree Graph - hernoemd naar het YouTube account.
        spg.algoritme(stappenLst, begin);

        // Print de kortste paden naar alle nodes vanaf 0.
        for (int i = 0; i < spg.afstanden.length; i++) {
            System.out.println(begin + " to " + i + " is " + spg.afstanden[i]);
        }
    }
}
