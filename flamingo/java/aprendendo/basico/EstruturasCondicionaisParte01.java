package flamingo.java.aprendendo.basico;

public class EstruturasCondicionaisParte01 {
    static void main() {
        byte idade = 16;
        boolean isPodeEntrarNaFesta = idade >= 18; // true
        String resultado;

        if(isPodeEntrarNaFesta) {
            resultado = "Pode entrar na festa! ";
        }else {
            resultado = "Não pode entrar na festa";
        }
        System.out.println(resultado);
    }
}