package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruchtest {
    
    // Kommentar
    public static void main(String[] args) {

        Bruch b = new Bruch ();
        b.zaehler = 4;
        b.nenner = 7;
             
        System.out.println("Bruchbeispiel A = " + b.zaehler + " / " + b.nenner);
        JOptionPane.showMessageDialog(null, "Bruchbeispiel A = " + b.zaehler + " / " + b.nenner);
    }
}