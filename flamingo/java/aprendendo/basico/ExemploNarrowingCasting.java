package flamingo.java.aprendendo.basico;

public class ExemploNarrowingCasting {
    public static void main(String[] args) {
        double numeroDouble = 10.72d;
        int numero =(int) numeroDouble;

        System.out.println("O numero double é: " + numeroDouble);
        System.out.println("O numero inteiro é: " + numero);
    }
}
