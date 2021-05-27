import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int s = 7; // Aantal stappen.

        // Maak een lijst aan met elke node
        List<List<Stap>> stappenLst = new ArrayList<List<Stap>>();
        for (int i = 0; i < s; i++) {
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

        stappenLst.get(6).add(new Stap(1,2)); // G -> B
        stappenLst.get(6).add(new Stap(5,5)); // G -> F

        // Bereken voor alle punten de kortste route naar alle punten.
        for (int a = 0; a < s; a++){
            Reis spg = new Reis(s); // Spanning Tree Graph - hernoemd naar het YouTube account.
            spg.algoritme(stappenLst, a);
            System.out.println("Alle kortste paden voor het begin punt " + a);
            for (int b = 0; b < spg.afstanden.length; b++) {
                System.out.println(a + " naar " + b + " is " + spg.afstanden[b]);
            }
        }

        //-----------------------------------------------------------------------------------------------------
        // Dan nog een graph waar gebruikgemaakt word van de verschillende opties van vervoer.

        int x = 4; // Aantal stappen.
        int begin = 0; // Begin punt.

        // Maak een lijst aan met elke node
        List<List<Stap>> stappen = new ArrayList<List<Stap>>();
        for (int i = 0; i < x; i++) {
            List<Stap> tempLst = new ArrayList<Stap>();
            stappen.add(tempLst);
        }


        stappen.get(0).add(new Rit(1,3));
        stappen.get(0).add(new TreinRit(1,3));
        stappen.get(0).add(new Vlucht(1,3));

        stappen.get(0).add(new Rit(2,2));
        stappen.get(0).add(new TreinRit(2,2));
        stappen.get(0).add(new Vlucht(2,2));

        stappen.get(0).add(new Rit(3,5));
        stappen.get(0).add(new TreinRit(3,5));
        stappen.get(0).add(new Vlucht(3,5));

        stappen.get(1).add(new Rit(2,7));
        stappen.get(1).add(new TreinRit(2,7));
        stappen.get(1).add(new Vlucht(2,7));

        stappen.get(1).add(new Rit(3,3));
        stappen.get(1).add(new TreinRit(3,3));
        stappen.get(1).add(new Vlucht(3,3));

        stappen.get(2).add(new Rit(3,1));
        stappen.get(2).add(new TreinRit(3,1));
        stappen.get(2).add(new Vlucht(3,1));

        stappen.get(3).add(new Rit(2,4));
        stappen.get(3).add(new TreinRit(2,4));
        stappen.get(3).add(new Vlucht(2,4));


        System.out.println("\nDan nog een korte demo dat de verschillende vervoersmogelijkheden ook werken.");
        // Bereken voor alle punten de kortste route naar alle punten.
        Reis graph = new Reis(x); //
        graph.algoritme(stappen, begin);
        System.out.println("Alle kortste paden voor het begin punt " + begin);
        for (int b = 0; b < graph.afstanden.length; b++) {
            System.out.println(begin + " naar " + b + " is " + graph.afstanden[b]);
        }
    }
}
