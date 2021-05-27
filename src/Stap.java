public class Stap {
    protected int stap;

    class Vlucht extends Stap{
        private double prijs;
        private int kans;
    }

    class rit extends Stap{
        private float afstand;
    }

    class treinrit extends Stap{
        private double tijd;
    }
}
