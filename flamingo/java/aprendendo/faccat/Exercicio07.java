package flamingo.java.aprendendo.faccat;
import java.util.Scanner;
public class Exercicio07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        byte idade, meses, dias;
        int totalDias;

        System.out.println("Qual sua idade: ");
        idade = sc.nextByte();

        System.out.printf("%d anos e quantos meses? ", idade);
        meses = sc.nextByte();

        System.out.printf("%d anos e %d meses e quantos dias? ", idade, meses);
        dias = sc.nextByte();

        totalDias = (idade * 365) + (meses * 30) + dias;

        System.out.printf("Você tem %d dias de vida.", totalDias);
        // ano (27 * 365) +
        // meses (3 * 30) +
        // dias  + 1
        sc.close();
    }
}
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.