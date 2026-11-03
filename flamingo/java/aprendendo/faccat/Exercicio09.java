package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio09 {
    // Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
    //Calcular e escrever o valor do novo salário.
    static void main() {
        Scanner sc = new Scanner(System.in);

        double salario, reajuste, novoSalario;

        System.out.printf("Digite seu salário: ");
        salario = sc.nextDouble();

        System.out.println("Digite o reajuste em %: "); // 10
        reajuste = sc.nextDouble();

        novoSalario = ((salario * reajuste) / 100) + salario;
        System.out.println(novoSalario);

        sc.close();
    }
}
