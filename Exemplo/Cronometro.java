package Exemplo;

public class Cronometro {
    public static void main(String[] args){
        for(int minuto =0; minuto <60; minuto++){
            for(int segundo = 0;segundo<60; segundo++){
                System.out.println(minuto + " : " + segundo);
            }
        }
    }
}
