import java.util.Scanner;

//Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
//Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
//calcule e mostre:
//a quantidade de jogadores com idade inferior a 18 anos;
//• a média das idades dos jogadores de cada time;
//• a média das alturas de todos os jogadores do campeonato;
//• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato
public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerodeTimes = 5, JogadoresPortime = 11, totalJogadores = numerodeTimes * JogadoresPortime;
        int jogadoresMenosDe18 = 0, jogadoresMaisDe80kg = 0;
        double totalIdade = 0, totalAltura = 0;
        int jogadoresAcima80kg = 0;


        for (int time = 1; time <= numerodeTimes; time++) {
            double totalIdadeTime = 0;
            for (int jogador = 1; jogador <= JogadoresPortime; jogador++) {
                System.out.println("Time " + time + ", Jogador " + jogador + ":");


                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();
                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();


                if (idade < 18) {
                    jogadoresMenosDe18++;
                }

                totalIdade += idade;
                totalIdadeTime += idade;


                totalAltura += altura;


                if (peso > 80) {
                    jogadoresAcima80kg++;
                }
            }


            double mediaIdadeTime = totalIdadeTime / JogadoresPortime;
            System.out.println("Média das idades dos jogadores do Time " + time + ": " + mediaIdadeTime);
        }


        double mediaAltura = totalAltura / totalJogadores;

        double porcentagemAcima80kg = (double) jogadoresAcima80kg / totalJogadores * 100;

        System.out.println("\nQuantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenosDe18);
        System.out.println("Média das alturas de todos os jogadores: " + mediaAltura);
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porcentagemAcima80kg + "%");


        sc.close();
    }
}
