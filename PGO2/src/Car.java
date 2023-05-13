public class Car {
    String kolor;
    String marka;
    double poj;

    public Car(String kolor, String marka, double poj) {
        this.kolor = kolor;
        this.marka = marka;
        this.poj = poj;
    }

    String kolorMarka(String kolor, String marka){
        return "Kolor samochodu - " + kolor + ", Marka samochodu - " + marka;
    }

    String czyWysokoobrotowy(int poj){
        if (poj>=2)
                return "Silnik jest wysokoobrotowy.";
        else
            return "Silnik nie jest wysokoobrotowy.";
    }

    @Override
    public String toString() {
        return "Car{" +
                "kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", poj=" + poj + "l" +
                '}';
    }

    public double getPoj() {
        return poj;
    }

    public void setPoj(double poj) {
        this.poj = poj;
    }
}
