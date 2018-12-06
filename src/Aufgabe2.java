import javax.swing.*;

public class Aufgabe2
{

    static String t = JOptionPane.showInputDialog("Bitte gib einen String-Wert ein.");
    static String s = t.substring(3);

    public static void main(String[] args)
    {
        System.out.println(s);
        System.out.println(Taschenrechner.a + Taschenrechner.b + Taschenrechner.c + Taschenrechner.d);
        System.out.println();/* zu 3 aber irgendwo ist ein dreher drinnen.. */
    }

    public String partialString (String t)
    {
        if (t.length() <= 2)
        {
            System.err.print("Sorry, gib bitte 3 oder mehr Zeichen ein.");
        }
        return t;
    }
}