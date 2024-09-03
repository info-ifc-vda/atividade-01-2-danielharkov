//Faça umprograma que, dados 2 vetores com 10 números inteiros cada, gere e imprima
// um vetor dos números não comuns aos vetores
public class a2 {
        public static void main (String[]args) {
            int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] vetor2 = {5, 6, 7, 11, 12, 13, 14, 15, 16, 17};

            System.out.println("Números não comuns aos vetores:");


            for (int i = 0; i < vetor1.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] == vetor2[j]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.print(vetor1[i] + " ");
                }
            }

            for (int i = 0; i < vetor2.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < vetor1.length; j++) {
                    if (vetor2[i] == vetor1[j]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.print(vetor2[i] + " ");
                }
            }
        }
}
