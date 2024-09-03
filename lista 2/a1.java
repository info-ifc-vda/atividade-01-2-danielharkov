//Façaumprogramaqueleiaumconjuntonãodeterminadodevalores, umdecadavez, e
// escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
// deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
// um número negativo ou 0.
import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.print("Digite um número (negativo ou 0 para encerrar): ");
            double valor = sc.nextDouble();

            if (valor <= 0) {
                break;
            }

            if (contador % 20 == 0) {

                System.out.printf("%-10s %-10s %-10s%n", "Valor", "Cubo", "Raiz");
                System.out.println("-------------------------------------");
            }

            double cubo = Math.pow(valor, 3);
            double raiz = Math.sqrt(valor);


            System.out.printf("%-10.2f %-10.2f %-10.2f%n", valor, cubo, raiz);

            contador++;
        }

        System.out.println("Programa finalizado.");
    }
}
