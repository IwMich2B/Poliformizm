package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Pigeon pigeon = new Pigeon();
        pigeon.breath();
        System.out.println();
        Animal[]animals = {animal,bird,pigeon};
        for (Animal a: animals) {
            a.breath();

        }
    }
}
