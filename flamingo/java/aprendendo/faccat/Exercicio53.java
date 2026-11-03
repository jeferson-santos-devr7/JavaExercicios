package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio53 {
    static void main() {
        // Ler um valor N e imprimir todos os valores inteiros entre 1
        // (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o valor N");
            n = sc.nextInt();
        }while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
