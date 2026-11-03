package JavaExerciciosGuiaPT2;

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10\n" +
                "para escolher onde a contagem ira parar");
        int numeroDigitado = sc.nextInt();

        while (numeroDigitado < 0){
            System.out.println("Digite um numero maior que 0\n" +
                    "para escolher onde a contagem ira parar");
            numeroDigitado = sc.nextInt();
        }

        for (int i = 1 ; i < 10; i++){
            if (i == numeroDigitado){
                System.out.println(numeroDigitado);
                break;
            }
            System.out.println(i);
        }

    }
}
