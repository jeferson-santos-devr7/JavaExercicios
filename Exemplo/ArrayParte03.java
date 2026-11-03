package Exemplo;

import java.util.Scanner;

public class ArrayParte03 {

    static void main() {
        // criar um arr com 4 espaço e adicionar nomes.
        // utilizem o Scanner para adicionar os nomes
        // utilizem laço for para adicionar os nomes e apresentar os valores
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for(int i = 0 ; i < arr.length; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            arr[i] = sc.nextLine();
        }

        for(String nome : arr) {
            System.out.printf("Nome: %s \n", nome);
        }
    }
}
