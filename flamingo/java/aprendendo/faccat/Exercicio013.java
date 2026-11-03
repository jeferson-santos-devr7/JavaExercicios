package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio013 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
        //Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
        //final é:

        float[] notas = new float[3];

        for (int i = 0; i < notas.length; i++) { //Enquanto i for menor que o tamanho do array notas faça
            System.out.println("Digite a " + (i + 1) + "° nota:");
            notas[i] = sc.nextFloat();
        }

        float media = ((notas[0] * 2f) + (notas[1] * 3f) + (notas[2] * 5f)) / 10f;
        System.out.printf("A média dos numeros digitados é: %.1f", media);

        sc.close();

    }
}
