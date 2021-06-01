public class Vlucht extends Stap {
    public Vlucht(int stap, int afstand){
        this.stap = stap;
        this.waarde = (int) (afstand * 1.15) + 8;
    }
}