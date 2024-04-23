package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruch {
    int zaehler;
    int nenner;

    void ausgeben() { 
        System.out.println("   Bruch = " + zaehler + " / " + nenner);
        JOptionPane.showMessageDialog(null, " Bruch = " + zaehler + " / " + nenner); 
    }
}
