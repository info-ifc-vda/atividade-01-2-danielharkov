import java.util.Scanner;

// Façaumprogramaquepreenchaumamatriz7x7denúmerosinteirosecriedoisvetores
// com sete posições cada um que contenham, respectivamente, o maior elemento de
// cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
// e os dois vetores gerados.
public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[7][7];
        int[] maioresLinhas = new int[7];
        int[] menoresColunas = new int[7];

        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maioresLinhas[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresColunas[j] = menor;
        }

        System.out.println("\nMatriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMaiores elementos de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%4d ", maioresLinhas[i]);
        }

        System.out.println("\n\nMenores elementos de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.printf("%4d ", menoresColunas[j]);
        }
    }
}