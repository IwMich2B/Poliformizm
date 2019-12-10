package pl.accenture;

public class Animal {
    {
        System.out.println("Blok kodu z klasy animal ");
    }
    static {
        System.out.println("Blok statyczny kodu z klasy animal ");
    }
    public Animal() {
        System.out.println("Konstruktor z klasy animal ");
    }
    void breath(){
        System.out.println("Oddech zwierzaka");
    }
}
