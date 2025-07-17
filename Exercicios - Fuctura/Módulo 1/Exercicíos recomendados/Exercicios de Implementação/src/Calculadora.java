public class Calculadora {

    //5) Crie uma classe Calculadora com um método somar() que receba dois números inteiros como parâmetros e realize a soma entre eles.
    public void somar(int num1, int num2){
        int soma = num1 + num2;
    }

    //6) Crie o método maior() da classe Calculadora que aceite três números como parâmetros e retorne o maior deles. Se os três números forem iguais, retorne uma mensagem informando isso.
    public String maior(int num1, int num2, int num3){
        if(num1 == num2 && num1 == num3){
            return "Os números são iguais.";
        } else if(num1 > num2 && num1 > num3){
            return num1 + " é o maior.";
        } else if(num2 > num3){
            return num2 + " é o maior.";
        } else {
            return num3 + " é o maior.";
        }
    }

}