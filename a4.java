import java.util.Scanner;
    //Faça um programa que receba
//• O código do produto comprado;
//• A quantidade comprada do produto
//Calcule e mostre:
//• O preço unitário do produto comprado, seguindo a Tabela I;
//• O preço total da nota;
//• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
//• O preço final da nota depois do desconto.
    public class a4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int codigo, quantidade;
            double precoUnitario = 0, precoTotal, desconto = 0, precoFinal;

            System.out.print("Digite o código do produto: ");
            codigo = scanner.nextInt();

            System.out.print("Digite a quantidade comprada: ");
            quantidade = scanner.nextInt();

            // PrecoUnitario seg a tabela I
            if (codigo >= 1 && codigo <= 10) {
                precoUnitario = 10.0;
            } else if (codigo >= 11 && codigo <= 20) {
                precoUnitario = 15.0;
            } else if (codigo >= 21 && codigo <= 30) {
                precoUnitario = 20.0;
            } else if (codigo >= 31 && codigo <= 40) {
                precoUnitario = 40.0;
            } else {
                System.out.println("Código inválido.");
                return;
            }


            precoTotal = precoUnitario * quantidade;

            // Desconto seg a tabela II
            if (precoTotal <= 250) {
                desconto = precoTotal * 0.05;
            } else if (precoTotal > 250 && precoTotal <= 500) {
                desconto = precoTotal * 0.10;
            } else if (precoTotal > 500) {
                desconto = precoTotal * 0.15;
            }

            precoFinal = precoTotal - desconto;

            System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
            System.out.printf("Preço total: R$ %.2f%n", precoTotal);
            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
        }
    }

