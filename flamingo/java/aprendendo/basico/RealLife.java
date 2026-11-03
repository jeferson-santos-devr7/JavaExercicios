package flamingo.java.aprendendo.basico;

public class RealLife {
    static void main(String[] args) {
        int maxScore = 500;
        int userScore = 423;

        double porcentagem = (double) userScore / maxScore * 100d;

        System.out.println("A porcentagem do usuario é de: " + porcentagem);
    }
}
