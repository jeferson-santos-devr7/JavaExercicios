package flamingo.java.aprendendo.faccat;

import java.util.Scanner;

public class Carrinho {
    // 10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    //distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    //seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
    //calcular e escrever o custo final ao consumidor.
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        double custoFabrica, valorNovo;

        System.out.println("Digite o valor bruto do carro: ");
        custoFabrica = sc.nextDouble();



        valorNovo = (custoFabrica * 1.28) * 1.45;
        System.out.println(valorNovo);

        sc.close();
    }
}
