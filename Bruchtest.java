package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch a = new Bruch ();
        a.zaehler = 7;
        a.nenner = 10;

        Bruch b = new Bruch ();
        b.zaehler = 3;
        b.nenner = 12;
        a.ausgeben();
        
        a.multiplizieren(b);
        System.out.println();
        a.ausgeben();

        b.setze(5, 3);
        System.out.println();
        b.ausgeben();
    }
}