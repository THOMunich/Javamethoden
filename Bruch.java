package JavaMethoden;

import javax.swing.JOptionPane;

public class Bruch {
    double zaehler;
    double nenner;

    void ausgebenA() { 
        System.out.println("   Bruch A = " + zaehler + " / " + nenner);
        JOptionPane.showMessageDialog(null, " Bruch A = " + zaehler + " / " + nenner); 
        }
    void ausgebenB() { 
        System.out.println("   Bruch B = " + zaehler + " / " + nenner);
        JOptionPane.showMessageDialog(null, " Bruch B = " + zaehler + " / " + nenner); 
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
            ausgebenA();
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
    // double dezimalwert (int zaehler, int nenner) {
    //     return (double)  zaehler/nenner;
    //     }
    
    double dezimalwert () {
        return (double)  zaehler/nenner;
        }

    int signum() {
        if (this.dezimalwert() == 0.0) {
            return 0;
        }
        if (this.dezimalwert() > 0.0) {
            return 1;
        }
        return -1;
        }

}