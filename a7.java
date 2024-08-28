// Faça um programa que leia dois números e apresente o fatorial de todos os números
//que estejam dentro do intervalo definido pelos números que foram lidos
import java.util.Scanner;
public class a7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Digite o primeiro número do intervalo: ");
                int numero1 = sc.nextInt();
                System.out.print("Digite o segundo número do intervalo: ");
                int numero2 = sc.nextInt();

                if (numero1 > numero2) {
                    System.out.println("O primeiro número deve ser menor ou igual ao segundo número.");
                } else {
                    for (int i = numero1; i <= numero2; i++) {
                        long fatorial = calcularFatorialIterativo(i);
                        System.out.println("O fatorial de " + i + " é " + fatorial);
                    }
                }

                sc.close();
            }

            public static long calcularFatorialIterativo(int n) {
                long fatorial = 1;
                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                }
                return fatorial;
            }
        }
