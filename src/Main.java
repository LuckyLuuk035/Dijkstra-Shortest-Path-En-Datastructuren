import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int s = 6; // Aantal stappen.
        int begin = 0; // Begin punt.

        // Maak een lijst aan met elke node
        List<List<Stap>> stappenLst = new ArrayList<List<Stap>>();
        for (int i = 0; i < s; i++) {
            List<Stap> item = new ArrayList<Stap>();
            stappenLst.add(item);
        }
    }
}
