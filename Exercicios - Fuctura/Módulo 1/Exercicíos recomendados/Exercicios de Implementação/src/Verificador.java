public class Verificador {

    //Crie uma classe Verificador com um método estático verificarParOuImpar() que receba um número inteiro como parâmetro e retorne uma mensagem indicando se o valor é par ou ímpar.
    public static String verificarParOuImpar(int num){
        if(num % 2 == 0){
            return num + " é par.";
        } else {
            return num + " é ímpar.";
        }
    }

}