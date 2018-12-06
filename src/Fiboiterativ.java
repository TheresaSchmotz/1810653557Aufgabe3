import javax.swing.*;

public class Fiboiterativ {
    //iterativer Ansatz

    public static int fibonacci(int n) { //Man muss die ersten beiden Anfangsvariablen festlegen, 0 und 1 sind immer fest
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) //Hier wird dei Fibonacci-Folge berechnet. a und b werden miteinander ausgetauscht und addiert.
        {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a; //der neue a wert wird ausgegeben, ebenso alle zahlen bis zur angegebenen stelle. Return weil kein void ist also ausgabewert verlangt wird.
    }
        public static void main(String[] args)
        {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die zu berechnende Zahl ein. "));

            for (int i = 0; i < n; i++) //Hier wurde festgelegt dass er nur die verlangte Anzahl an Fibozahlen ausgeben soll.
            {
                System.out.println(fibonacci(i));
            }
        }

    }
