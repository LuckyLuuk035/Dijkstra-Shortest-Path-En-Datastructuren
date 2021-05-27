import java.util.Comparator;

public class Stap implements Comparator<Stap> {
    public int stap;
    public int waarde;

    public Stap() {

    }
    public Stap(int stap, int afstand) {
        this.stap = stap;
        this.waarde = afstand;
    }


    public int compare(Stap o1, Stap o2) {
        if (o1.waarde < o2.waarde)
            return -1;
        if (o1.waarde > o2.waarde)
            return 1;
        return 0;
    }
}

class Rit extends Stap {
    public Rit(int stap, int km) {
        this.stap = stap;
        this.waarde = km + 10;
    }
}
class TreinRit extends Stap {
    public TreinRit(int stap, int tijd) {
        this.stap = stap;
        this.waarde = tijd * 3;
    }
}

class Vlucht extends Stap {
    public Vlucht(int stap, int afstand){
        this.stap = stap;
        this.waarde = (int) (afstand * 1.15) + 8;
    }
}