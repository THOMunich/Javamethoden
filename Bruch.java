package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruch {
    int zaehler;
    int nenner;

    void ausgeben() { 
        System.out.println("   Bruch = " + zaehler + " / " + nenner);
        JOptionPane.showMessageDialog(null, " Bruch = " + zaehler + " / " + nenner); 
    }

    void kuerzen() {
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }

        zaehler /= n;
        nenner /= n;
        }

    void gekuerztausgeben() {
            kuerzen();
            ausgeben();
        }

    void erweitern(int a) {
        zaehler = zaehler * a;
        nenner = nenner * a;
        }
}

