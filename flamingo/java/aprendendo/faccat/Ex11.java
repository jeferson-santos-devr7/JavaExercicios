package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Ex11
{
    static void main() {
        double novoSalarioFuncionario;
        float salarioFuncionario, totalDeVendas, comissaoPorCarros;
        byte qtdCarrosVendidos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salario fixo do vendedor:");
        salarioFuncionario = sc.nextFloat();
        System.out.println("Informe a quantidade de carros vendidos:");
        qtdCarrosVendidos = sc.nextByte();
        System.out.println("Informe a comissão por carro vendido:");
        comissaoPorCarros = sc.nextFloat();
        System.out.println("Informe o valor total das vendas:");
        totalDeVendas = sc.nextFloat();

        novoSalarioFuncionario = salarioFuncionario + (qtdCarrosVendidos*comissaoPorCarros) + (totalDeVendas*0.05);

        System.out.println("O novo salario do funcionario: " + novoSalarioFuncionario);

        sc.close();
    }
}
//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor.