import java.util.Scanner;
public class a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPrimo = 0;

        for (int i = 0; i < 10; i++) {
            // Exibe a posição do número (1º, 2º, etc.)
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            int num = sc.nextInt();


            if (isPrime(num)) {
                contadorPrimo++;
            }
        }


        System.out.println("Quantidade de números primos: " + contadorPrimo);
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;

        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}