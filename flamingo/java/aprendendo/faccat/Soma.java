package flamingo.java.aprendendo.faccat;

import java.util.Scanner;
public class Soma {
/** Jailson
 * Lu
 * Gui Gui
 * Bambu africano
 *
 * @author = "Faculdade Flamingo"*/
    public static void main(String[] args){

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa flamingo.java.aprendendo.faccat.Soma");
        System.out.println("Digite o primeiro numero");
        int numero1 = entradaDados.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = entradaDados.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros é :" + soma);
    }
}
