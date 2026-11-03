package Exemplo;

public class ArrayParte04 {
    static void main() {
        int[][] numeros = new int[3][3];

        int[][] calendario = new int[12][31];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        numeros[1][0] = 23;
        numeros[1][1] = 25;
        numeros[1][2] = 27;

        numeros[2][0] = 233;
        numeros[2][1] = 235;
        numeros[2][2] = 227;

        for(int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }
}
