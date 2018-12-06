import javax.swing.*;

public class Fiborekursiv {
    //Rekursiver Ansatz
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die zu berechnende Zahl ein. "));
        int loesung = fibonacci(i);
        System.out.println(loesung);
    }

    static int fibonacci ( int i)
    {
        if (i <= 0)
            return 0;

        else if(i ==1)
            return 1;

        else
            return fibonacci(i-2)+fibonacci(i-1);

    }

}
