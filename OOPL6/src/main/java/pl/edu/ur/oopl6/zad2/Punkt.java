package pl.edu.ur.oopl6.zad2;

public class Punkt {

    private int x;
    private int y;
    private int z;

    // Pole statyczne przechowujące w pamięci ilość obiektów klasy Punkt
    // Pole jest współdzielone dla wszystkich obiektów
    private static int counter;
    public static Punkt last_point;

    public Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }
