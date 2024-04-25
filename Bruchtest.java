package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch a = new Bruch ();
        a.zaehler = Double.parseDouble(JOptionPane.showInputDialog(null, "Bruch A, bitte erste Zahl eingeben: "));
        a.nenner = Double.parseDouble(JOptionPane.showInputDialog(null, "Bruch A, bitte zweite Zahl eingeben: "));

        Bruch b = new Bruch ();
        b.zaehler = Double.parseDouble(JOptionPane.showInputDialog(null, "Bruch B, bitte erste Zahl eingeben: "));
        b.nenner = Double.parseDouble(JOptionPane.showInputDialog(null, "Bruch B, bitte zweite Zahl eingeben: "));
        System.out.println();
        a.ausgebenA();
        
        a.multiplizieren(b);
        System.out.println();
        a.ausgebenA();

        b.setze(1, 1);
        System.out.println();
        b.ausgebenB();
        
        System.out.println();
        System.out.println("Dezimalwert: " + b.dezimalwert (2,6));
        JOptionPane.showMessageDialog(null,"Dezimalwert: " +  b.dezimalwert (2,6));

        }
}