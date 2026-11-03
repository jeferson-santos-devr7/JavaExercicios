package flamingo.java.aprendendo.basico;

import java.util.Scanner;

public class MediaNotas {
    // 4 notas e fazer a media

    static void main() {
        float nota, media, soma = 0;
        int i = 0;
        String resultado;
        Scanner sc = new Scanner(System.in);

        while (i < 4) {
            System.out.printf("Digite a %dº nota : \n", i + 1);
            nota = sc.nextFloat();
            soma += nota;

            i++;
        }
        media = soma / 4;
        resultado = media >= 6 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }


}
