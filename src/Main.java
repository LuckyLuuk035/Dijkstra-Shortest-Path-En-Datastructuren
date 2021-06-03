import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Locatie l0 = new Locatie("0");
        Locatie l1 = new Locatie("1");
        Locatie l2 = new Locatie("2");
        Locatie l3 = new Locatie("3");
        Locatie l4 = new Locatie("4");
        Locatie l5 = new Locatie("5");
        Locatie l6 = new Locatie("6");
        Locatie l7 = new Locatie("7");
        Locatie l8 = new Locatie("8");

        l0.addTransitie(new Stap(l1, 4));
        l0.addTransitie(new Stap(l7, 8));
        l1.addTransitie(new Stap(l2, 8));
        l1.addTransitie(new Stap(l7, 11));
        l2.addTransitie(new Stap(l3, 7));
        l2.addTransitie(new Stap(l5, 4));
        l2.addTransitie(new Stap(l8, 2));
        l3.addTransitie(new Stap(l4, 9));
        l3.addTransitie(new Stap(l5, 14));
        l4.addTransitie(new Stap(l5, 10));
        l5.addTransitie(new Stap(l6, 2));
        l6.addTransitie(new Stap(l7, 1));
        l6.addTransitie(new Stap(l8, 6));
        l7.addTransitie(new Stap(l8, 7));

        Reis voorbeeld = new Reis(l0, l8);
        List<Locatie> loc = new ArrayList<Locatie>();
        Collections.addAll(loc, l0, l1, l2, l3, l4, l5, l6, l7);
        voorbeeld.setLocatie(loc);
        voorbeeld.run();
        for (Locatie i : voorbeeld.getLocaties()) {
            System.out.println(i.getWaarde());
        }
    }
}
