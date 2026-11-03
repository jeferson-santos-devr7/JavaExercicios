package Exemplo;

public class ArrayParte02 {
    static void main() {
        String[] nomes = new String[5];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";
        nomes[3] = "Ichigo";
        nomes[4] = "Zoro";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[6];

        nomes[5] = "Sanji";

        System.out.println(nomes[3]);



    }
}
