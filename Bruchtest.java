package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch a = new Bruch ();
        a.zaehler = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte die erste Zahl eingeben: "));
        a.nenner = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte die zweite Zahl eingeben: "));

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