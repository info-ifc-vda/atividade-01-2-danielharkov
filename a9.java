// Faça um programa que leia um número inteiro e diga se ele é primo.
 import java.util.Scanner;
public class a9 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int numPrimo;
        int numDivisores = 0;


        System.out.println("Digite um número");
        numPrimo = sc.nextInt();
        for (int i=1; i <= numPrimo; i++){
            if (numPrimo%i==0){
                numDivisores++;
            }
        }

        if (numDivisores== 2){
            System.out.println("O número digitado eh primo");
        }
        else {
            System.out.println("O numero digitado nao eh primo");
        }
    }
}
