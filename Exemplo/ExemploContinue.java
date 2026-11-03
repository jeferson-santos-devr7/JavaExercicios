package Exemplo;

public class ExemploContinue {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 4 || i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
