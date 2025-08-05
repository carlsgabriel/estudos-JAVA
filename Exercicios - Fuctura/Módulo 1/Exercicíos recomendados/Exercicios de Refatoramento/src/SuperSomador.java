public class SuperSomador {

        //4)Desenvolva uma classe SuperSomador com um método estático somarValores() que receba dois números como parâmetros e depois retorne a soma de todos os valores no intervalo entre os valores recebidos.
    public static int somarValores(int num1, int num2){
        int soma = 0;
        if(num1 > num2){
            for(int i=num1-1;i>num2;i--){
                soma += i;
            }
        } else {
            for(int i=num1+1;i<num2;i++){
                soma += i;
            }
        }
        return soma;
    }

}
