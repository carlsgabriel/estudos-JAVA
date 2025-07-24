public class Fibonacci {

    /*
    DESAFIO 
    Desenvolva uma classe Fibonacci com um método estático gerarSequencia() que receba um único valor inteiro como parâmetro, indicando quantos termos da sequência serão mostrados na tela.
    */
    public static String gerarSequencia(int num){
        StringBuilder sb = new StringBuilder();

        int a = 1;
        int b = 1;
        int c = a + b;

        for(int i=0;i<num;i++){
            sb.append(a + " ");
            a = b;
            b = c;
            c = a + b;
        }

        return sb.toString();
    }

}