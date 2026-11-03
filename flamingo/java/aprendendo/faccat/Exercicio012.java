package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio012 {
    static void main() {
        // Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
        //correspondente em graus Celsius (baseado na fórmula abaixo):

        // C = (F - 32) × 5/9
        // 5/9 = 1,8

        float grausFahrenheit, grausCelsius;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit para descobrir graus Celsius: ");

        grausFahrenheit = sc.nextFloat();
        grausCelsius = (grausFahrenheit - 32) * 5/9;

        System.out.printf("%.1f ºF = %.1f ºC", grausFahrenheit, grausCelsius);

        sc.close();
    }
}
