import java.util.Scanner;

//Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
//que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
//residência, calcule e mostre:
//• o valor de cada quilowatt;
//• o valor a ser pago por essa residência;
public class a2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salario minimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite a quantidade de quillowatts consumida: ");
        int quillowatsConsumidos = sc.nextInt();

        double valorPorQuilowatt = salarioMinimo * 0.01;
        double valor = valorPorQuilowatt * quillowatsConsumidos;

        System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorPorQuilowatt);
        System.out.printf("Valor a ser pago em: R$ %.2f%n", valor);
        sc.close();

    }
}
