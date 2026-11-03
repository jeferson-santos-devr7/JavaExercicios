package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex8 {

    static void main() {
        double votosBrancos, votosNulos, votosValidos, totalEleitores;

        double percentualBrancos, percentualNulos, percentualValidos;

        Scanner sc = new Scanner(System.in);
        System.out.print("----PERCENTUAL ELEITORES---- \n");
        System.out.println("Número de votos brancos: ");
        votosBrancos = sc.nextDouble();
        System.out.println("Número de votos nulos: ");
        votosNulos = sc.nextDouble();
        System.out.println("Número de votos validos: ");
        votosValidos = sc.nextDouble();

        totalEleitores = votosNulos+votosBrancos+votosValidos;

        percentualBrancos = (votosBrancos/totalEleitores)*100;
        percentualNulos = (votosNulos/totalEleitores)*100;
        percentualValidos = (votosValidos/totalEleitores)*100;


        System.out.println(percentualValidos);
        System.out.println(percentualBrancos);
        System.out.println(percentualNulos);
        sc.close();
    }
}



//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.