package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruch {
    double zaehler;
    double nenner;

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
    void erweitern (double a) {
        zaehler = zaehler * a;
        nenner = nenner * a;
        }
    void multiplizieren(Bruch m) {
        zaehler = zaehler * m.zaehler;
        nenner = nenner * m.nenner;
        }
    void setze (int z) {
        zaehler = z;
        nenner = 1;
        }
    void setze (int z, int n) {
        zaehler = z;
        nenner = n;
        }
}

