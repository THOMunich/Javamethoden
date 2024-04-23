package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch a = new Bruch ();
        a.zaehler = 3;
        a.nenner = 4;

        Bruch b = new Bruch ();
        b.zaehler = 3;
        b.nenner = 4;
        a.ausgeben();
        
        a.multiplizieren(b);
        System.out.println();
        a.ausgeben();
    }
}