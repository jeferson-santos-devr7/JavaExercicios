package flamingo.java.aprendendo.intermediario.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public short ano;
    public short velocidadeAtual;

    public void isMulta() {
        if(velocidadeAtual > 80) {
            System.out.println("Multado!");
        }
    }
}
