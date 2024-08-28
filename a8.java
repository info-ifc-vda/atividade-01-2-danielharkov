//8. Faça uma calculadora de troco, baseado nas cédulas da nossa moeda.
import java.util.Scanner;
public class a8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Entradas
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - valorCompra;
        if (troco < 0) { System.out.println("Nao eh possivel efetuar o pagamento");
                return;
        }

        System.out.printf("O troco a ser dado é: R$ %.2f%n", troco);
//
        System.out.println("Cédulas:");
        if (troco >= 100) {
            int quantidade = (int) (troco / 100);
            System.out.printf("%d cédulas de R$ 100\n", quantidade);
            troco %= 100;
        }
        if (troco >= 50) {
            int quantidade = (int) (troco / 50);
            System.out.printf("%d cédulas de R$ 50\n", quantidade);
            troco %= 50;
        }
        if (troco >= 20) {
            int quantidade = (int) (troco / 20);
            System.out.printf("%d cédulas de R$ 20\n", quantidade);
            troco %= 20;
        }
        if (troco >= 10) {
            int quantidade = (int) (troco / 10);
            System.out.printf("%d cédulas de R$ 10\n", quantidade);
            troco %= 10;
        }
        if (troco >= 5) {
            int quantidade = (int) (troco / 5);
            System.out.printf("%d cédulas de R$ 5\n", quantidade);
            troco %= 5;
        }
        if (troco >= 2) {
            int quantidade = (int) (troco / 2);
            System.out.printf("%d cédulas de R$ 2\n", quantidade);
            troco %= 2;
        }

        // Calcula e exibe o troco usando moedas
        System.out.println("Moedas:");
        if (troco >= 1) {
            int quantidade = (int) (troco / 1);
            System.out.printf("%d moedas de R$ 1\n", quantidade);
            troco %= 1;
        }
        if (troco >= 0.50) {
            int quantidade = (int) (troco / 0.50);
            System.out.printf("%d moedas de R$ 0.50\n", quantidade);
            troco %= 0.50;
        }
        if (troco >= 0.25) {
            int quantidade = (int) (troco / 0.25);
            System.out.printf("%d moedas de R$ 0.25\n", quantidade);
            troco %= 0.25;
        }
        if (troco >= 0.10) {
            int quantidade = (int) (troco / 0.10);
            System.out.printf("%d moedas de R$ 0.10\n", quantidade);
            troco %= 0.10;
        }
        if (troco >= 0.05) {
            int quantidade = (int) (troco / 0.05);
            System.out.printf("%d moedas de R$ 0.05\n", quantidade);
            troco %= 0.05;
        }
        if (troco >= 0.01) {
            int quantidade = (int) (troco / 0.01);
            System.out.printf("%d moedas de R$ 0.01\n", quantidade);
            troco %= 0.01;
        }
//
        sc.close();
    }
}