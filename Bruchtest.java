package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch b = new Bruch ();
        b.zaehler = 3;
        b.nenner = 12;
        b.ausgeben();
        
        System.out.println("  \n und nach dem Kuerzen: ");
        JOptionPane.showMessageDialog(null,"  /n und nach dem Kuerzen: ");
        
        b.kuerzen();
        b.ausgeben();
    }
}