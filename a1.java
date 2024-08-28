import java.util.Scanner;
//Faça um programa que recebe o número de horas trabalhadas, e o valor da hora
// trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
//        • o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
//hora trabalhada;
//o imposto equivale a 30% do salário bruto;
//• o salário a receber equivale ao salário bruto menos o imposto
public class a1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();


        double salarioBruto = horasTrabalhadas * valorHora;


        double imposto = 0.30 * salarioBruto;


        double salarioAReceber = salarioBruto - imposto;
        //
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário a Receber: R$ %.2f%n", salarioAReceber);

        scanner.close();
        }
    }
