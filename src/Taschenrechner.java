import javax.swing.*;
public class Taschenrechner{
    static int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib int-Wert a ein."));
    static int b = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib int-Wert b ein."));
    static double c = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib double-Wert c ein."));
    static double d = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib double-Wert d ein."));

    public static double addieren(int a, int b, double c, double d){
        int aundb = a+b;
        double cundd = c+d;
        return aundb + cundd;
    }
    public static double subtrahieren(int a, int b, double c, double d){
        int aundb = a-b;
        double cundd = c-d;
        return aundb + cundd;
    }

    public static double multiplizieren(int a, int b, double c, double d){
        int aundb = a*b;
        double cundd = c*d;
        return aundb + cundd;
    }

    public static double dividieren(int a, int b, double c, double d){
        int aundb = a%b;
        double cundd = c%d;
        return aundb + cundd;
    }
}