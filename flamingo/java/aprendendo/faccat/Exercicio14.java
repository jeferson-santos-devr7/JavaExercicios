package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio14 {

    /* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10! */

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Programa Maior ou Menor que 10!--");
        System.out.println("Digite um número");

       float numeroDigitado = sc.nextFloat();

        if (numeroDigitado > 10){
            System.out.println("É maior que 10!");
        }else if (numeroDigitado == 10) {
            System.out.println("É o 10 doido!");
        }else {
            System.out.println("É menor que 10!");
        }


    }
}
