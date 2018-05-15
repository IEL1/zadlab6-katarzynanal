package pl.edu.ur.oopl6.zad2;

import java.util.Random;

public class ObjectCounter {
    public static void main(String[] args){
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}
  /**
   * r.nextInt(n)- podaje nam losowo liczby z przedziału od 0 do n-1
     *Program wyświetla 10 obiektów tej klasy. Random jest to generator pseudolosowy  która wyrzuca nam losowo typy liczb z podanego rzez nas zakresu.
     losuje wspólrzedne i doje do klas obiektow
     */