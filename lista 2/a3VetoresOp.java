//Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
// calcule e mostre 2 vetores resultantes:
// • no primeiro vetor resultante, cada elemento será composto pela soma de cada
// número par do primeiro vetor somado a todos os números do segundo vetor;
// • o segundo vetor resultante será composto pela quantidade de divisores que cada
// número ímpar do primeiro vetor tem no segundo vetor
public class a3VetoresOp {
    public static void main(String[] args) {
        int[] vetor1 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int[] vetor2 = {1, 2, 3, 4, 5};

        int[] somaPares = new int[10];
        int[] divisoresImpares = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {  // ver se o número é par
                int soma = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    soma += vetor1[i] + vetor2[j];  // soma o nmr par com cada elemento do vetor2
                }
                somaPares[i] = soma;
            }
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {  // ver se o nmr eh impar
                int divisores = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {  // ver se o nmr do vetor1 eh divisivel pelo número do vetor2
                        divisores++;
                    }
                }
                divisoresImpares[i] = divisores;
            }
        }

        System.out.println("Vetor resultante da soma dos numeros pares:");
        for (int i = 0; i < somaPares.length; i++) {
            System.out.print(somaPares[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor resultante da quantidade de divisores dos numeros impares:");
        for (int i = 0; i < divisoresImpares.length; i++) {
            System.out.print(divisoresImpares[i] + " ");
        }
    }
}