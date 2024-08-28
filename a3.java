import java.util.Scanner;

//. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
//obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.
public class a3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro angulo : ");
        double angulo1 = sc.nextDouble();

        System.out.println("Digite o segundo angulo : ");
        double angulo2 = sc.nextDouble();

        System.out.println("Digite o terceiro angulo : ");
        double angulo3 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado do primeiro angulo : ");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado do segundo angulo : ");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado do terceiro angulo : ");
        double lado3 = sc.nextDouble();

        if (angulo1 + angulo2 + angulo3 != 180){
            System.out.println("Os ângulos fornecidos não formam um triângulo válido");
            sc.close();
            return;
        }

        String tipoDeTriangulo = sc.next();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
            tipoDeTriangulo = "Retângulo";
        }
        else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
            tipoDeTriangulo = "Obtusangulo";}
        else {
            tipoDeTriangulo = "Acutângulo";
        }

        String tipoDeLado = sc.next();
        if (lado1 == lado2 && lado2 == lado3){
            tipoDeLado = "Equilátero";
        }

        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            tipoDeLado = "escaleno";
        }

        else {
            tipoDeLado = "isoceles";
        }

        System.out.printf("O triângulo é %s e %s.%n", tipoDeTriangulo, tipoDeLado);
        sc.close();
    }
    }

