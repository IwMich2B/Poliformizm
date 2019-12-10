package pl.accenture;

public class Pigeon extends Bird {
    {
        System.out.println("Blok kodu z klasy pigeon");
    }
    static {
        System.out.println("Blok statyczny kodu z klasy pigeon");
    }
    public Pigeon() {
        System.out.println("Konstruktor z klasy Pigeon ");
    }

    @Override
    void breath() {
       // super.breath();
        System.out.println("Oddech Pigeon");
    }
}
