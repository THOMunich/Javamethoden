package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch b = new Bruch ();
        b.zaehler = 3;
        b.nenner = 12;
        b.ausgeben();
        
        b.erweitern(4);
        System.out.println();
        b.ausgeben();
    }
}