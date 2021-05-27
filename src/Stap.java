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

class TreinRit extends Stap {
    public TreinRit(int stap, int tijd) {
        this.stap = stap;
        this.waarde = tijd;
    }
}

class Vlucht extends Stap {
    public Vlucht(int stap, int afstand){
        this.stap = stap;
        this.waarde = afstand;
    }
}

//     class Vlucht {
//        private double prijs;
//        private double kans = 1.00;
//        private double kosten;
//
//        public double getPrijs() {
//            return prijs;
//        }
//
//        public void setPrijs() {
//            this.prijs = afstand * 15;
//        }
//
//        public double getKans() {
//            return kans;
//        }
//
//        public void setKans() {
//            this.kans = kans * 1.03;
//        }
//
//        public void setKosten() {
//            this.kosten = this.prijs * this.kans;
//        }
//    }
//
//    class rit {
//        private double km;
//
//        public void setKm() {
//            this.km = afstand * 10;
//        }
//    }
//
//    class treinrit {
//        private double tijd;
//    }