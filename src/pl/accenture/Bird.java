package pl.accenture;

public class Bird extends Animal {
    {
        System.out.println("Blok kodu z klasy bird ");
    }
    static {
        System.out.println("Blok statyczny kodu z klasy bird ");
    }
    public Bird() {
        System.out.println("Konstruktor z klasy bird ");
    }

    @Override
    void breath() {
       // super.breath();
        System.out.println("Oddech ptasi");
    }
}
