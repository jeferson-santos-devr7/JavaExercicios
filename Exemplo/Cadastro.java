package Exemplo;

public class Cadastro {

    static void main(String[] args) {
        exibirDadosDoCliente("Luana", 13,89055909,"Av da silva mastubo");
    }

    static void exibirDadosDoCliente(String nome, int idade, int CPF, String endereco){
        System.out.println("O nome do cliente é: " + nome);
        System.out.println("A sua idade é: " + idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereço: " + endereco);
    }
}
