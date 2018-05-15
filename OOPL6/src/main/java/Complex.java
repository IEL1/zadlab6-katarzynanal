package pl.edu.ur.oopl6.zad2;

import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class Complex {
    public static void Liczbazespolona(double re,double im){
        System.out.println("Liczba ma postać: " + re + " + " +im + "i" );
    }
    /**
     * Metoda obliczająca moduł liczby zespolonej
     * @param re
     * @param im
     * @return 
     */
    public static double Modul(double re, double im){
        return Math.hypot(re,im);
    }
    /**
     * Metoda wyznaczająca liczbę sprzężoną
     * @param re
     * @param im 
     */
    public static void LiczbaSprzezona(double re, double im){
        if(im>0){
            System.out.println("Liczba sprzężona ma postać: " + re 
                    + " - " + im + "i");
        }
        else
        {
            double im2 = Math.abs(im);
            System.out.println("Liczba sprzężona ma postać: " + re + " + " + im2 + "i");
        }
    }/**
     * Metoda dodająca dwie liczby zespolone 
     * @param re
     * @param im 
     * @param re2
     * @param im2
     */ 
    public static void DodawanieAlgebraiczne(double re, double im, double re2, double im2){
        double dodawanie1 = re + re2;
        double dodawanie2 = im + im2;
        System.out.print("Wynik dodawania to: " + dodawanie1 + " + "
        + dodawanie2 + "i");
        
    }
    public static void OdejmowanieAlgebraiczne(double re, double im, double re2, double im2){
        double odejmowanie1 = re - re2;
        double odejmowanie2 = im - im2;
        if(odejmowanie1 < 0){
            double odejmowanie3 = Math.abs(odejmowanie1);
            System.out.print("Wynik odejmowania to: -" + odejmowanie3 + " - "
            + odejmowanie2 + "i");
        }
        else{
            System.out.print("Wynik odejmowania to: " + odejmowanie1 + " + "
            + odejmowanie2 + "i");
        }
    }
    public static void MnozenieAlgebraiczne(double re, double im, double re2, double im2){
        double mnozenie1, mnozenie2;
        mnozenie1 = (re*re2) - (im*im2);
        mnozenie2 = (re*im2) + (re2*im);
        System.out.println("Wynik mnożenia wynosi: " + mnozenie1 + " + " 
        + mnozenie2 + "i");
    }
    public static void DzielenieAlgebraiczne(double re, double im, double re2, double im2){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menu;
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz zadanie: ");
        System.out.println("[1] Moduł liczby zespolonej\n[2]"
                + " Wartość liczby sprezężonej doliczby zespolonej\n"
                + "[3] Dodawanie (postać algebraiczna)\n"
                + "[4] Odejmowanie (postać algebraczna)\n"
                + "[5] Mnożenie algebraiczne\n"
                + "[6] Dzielenie algebraiczne\n");
        menu = in.nextInt();
        switch(menu){
                case 1: System.out.println("Moduł liczby zespolonej wynosi: " + Modul(2,7));
                    break;
                case 2: LiczbaSprzezona(5,9);
                    break;
                case 3: DodawanieAlgebraiczne(1,4,8,6);
                    break;
                case 4: OdejmowanieAlgebraiczne(1,4,8,6);
                    break;
                case 5: MnozenieAlgebraiczne(1,4,8,6);
                    break;
                case 6: DzielenieAlgebraiczne(1,4,8,6);
                    break;
                default: System.out.println("Numr który wybrales jest poza zakresem ");
        }   
    }    
}