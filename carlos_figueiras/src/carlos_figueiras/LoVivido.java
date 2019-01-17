/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String k;
        String i;

        int n;
        int f;
        int t;
        int o;

        k = JOptionPane.showInputDialog("Escriba su nombre: ");
        i = JOptionPane.showInputDialog("Escriba su edad: ");

        o = Integer.parseInt(i);

        n = (o * 12);
        f = (o * 365);
        t = (f * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + n, "Numero de meses vividos de " + k, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + f, "Numero de días vividos de " + k, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + t, "Numero de horas vividos de " + k, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
