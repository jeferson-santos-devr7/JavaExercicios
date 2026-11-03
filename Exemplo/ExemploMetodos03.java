package Exemplo;

import java.util.Scanner;

public class ExemploMetodos03 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Soma\n[2] Subtração");
        byte digito = sc.nextByte();


    }

    static int soma(int valor1, int valor2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = sc.nextInt();
    return valor1 + valor2;
    }

    static int subtracao(int valor1, int valor2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = sc.nextInt();
        return valor1 - valor2;
    }
}
