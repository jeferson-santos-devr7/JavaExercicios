package flamingo.java.aprendendo.intermediario.test;


import flamingo.java.aprendendo.intermediario.dominio.Pessoa;



public class PessoaTest01 {
    static void main() {
        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa02 = new Pessoa();

        pessoa01.nome = "Bigas";
        pessoa01.idade = 27;
        pessoa01.peso = 86.5;
        pessoa01.sexo = 'M';

        pessoa02.nome = "Maria";
        pessoa02.idade = 22;
        pessoa02.peso = 56.5;
        pessoa02.sexo = 'F';

        System.out.printf("""
                Nome: %s
                idade: %d anos
                peso: %.2f Kg
                sexo: %s
                """, pessoa01.nome, pessoa01.idade, pessoa01.peso, pessoa01.sexo);
    }
}
