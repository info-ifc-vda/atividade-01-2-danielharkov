import javax.swing.*;
import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("Digite um número para calcular o fatorial: ");
        int numero;

        try {
            numero = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O fatorial não está definido para números negativos.");
        } else {

            long fatorial = calcularFatorialRecursivo(numero);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
        }
    }

    public static long calcularFatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorialRecursivo(n - 1);
        }
    }
}