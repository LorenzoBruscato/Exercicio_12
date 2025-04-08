package exercicio_12;

import javax.swing.JOptionPane;

public class Exercicio_12 {

    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira primeiro número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior numero é o: " + numero1);
        } else {
            if (numero2 > numero1) {
                JOptionPane.showMessageDialog(null, "O maior numero é o: " + numero2);
            } else {
                if (numero1 == numero2) {
                    JOptionPane.showMessageDialog(null, "Os números são iguais");
                }
            }
        }
    }
}