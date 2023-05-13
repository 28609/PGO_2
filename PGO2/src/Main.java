public class Main {
    public static void main(String[] args) {
        Telephone telefon1 = new Telephone("Samsung", 6,659842478);
        Telephone telefon2 = new Telephone("Iphone", 10, 984215734);

        Car samochod1 = new Car("srebrny", "Audi", 2);
        Car samochod2 = new Car("Czarny", "BMW", 3);

        System.out.println(telefon1.wyslijWiadomosc("Czesc", telefon2.numer));
        System.out.println(samochod1.kolorMarka(samochod2.kolor, samochod2.marka));
    }
}