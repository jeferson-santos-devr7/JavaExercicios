package flamingo.java.aprendendo.intermediario.test;

import flamingo.java.aprendendo.intermediario.dominio.Carro;

public class CarroTest01 {
    static void main() {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Civic";
        carro01.modelo = "Honda";
        carro01.ano = 1999;
        carro01.velocidadeAtual = 90;


        carro02.nome = "Civic";
        carro02.modelo = "Honda";
        carro02.ano = 2006;
        carro02.velocidadeAtual = 130;


        System.out.printf("""
                Nome: %s
                Modelo: %s
                Ano: %d
                Velocidade Atual: %d
                """, carro01.nome, carro01.modelo, carro01.ano, carro01.velocidadeAtual);

        carro01.isMulta();

        System.out.println("-----------------------------------------");

        System.out.printf("""
                Nome: %s
                Modelo: %s
                Ano: %d
                Velocidade Atual: %d
                """, carro02.nome, carro02.modelo, carro02.ano, carro02.velocidadeAtual);
        carro02.isMulta();

    }
}
