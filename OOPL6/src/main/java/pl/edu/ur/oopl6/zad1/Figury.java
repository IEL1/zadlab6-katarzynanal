package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.round(Math.PI*Math.pow(r,2));
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return Math.round(2*Math.PI*r);
    }
    
    /**
     * Metoda statyczna obliczająca pole kwadratu
     */
    public static double PoleKwadratu(double a){
        return Math.pow(a,2);
    }
    /**
     * Metoda statyczna obliczająca obwód kwadratu
     */
    public static double ObwodKwadratu(double a){
        return 4*a;
    }
    /**
     * Metoda statyczna obliczająca pole prostokąta
     */
    public static double PoleProstokata(double a, double b){
        return a*b;
    }
    /**
     * Metoda statyczna obliczająca obwód prostokata
     */
    public static double ObwodProstokata(double a, double b){
        return 2*(a+b);
    }
    /**
     * Metoda statyczna obliczająca pole stożka
     */
    public static double PoleStozka(double r, double H){
        return Math.round(((Math.PI*Math.pow(r,2))/3)*H);
    }
   /**
     * Metoda statyczna obliczająca pole walca
     */
    public static double PoleWalca(double r, double H){
        return Math.round((Math.PI*Math.pow(r,2))*H);
    }
    
    
}
