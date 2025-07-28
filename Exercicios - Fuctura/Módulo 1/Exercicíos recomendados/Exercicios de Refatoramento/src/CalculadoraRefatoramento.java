public class CalculadoraRefatoramento {

    //1) Refatore o método somar() da classe Calculadora para adicionar um retorno do tipo int, de forma que o método realize a soma dos dois números e retorne o resultado calculado.
    public int somar(int num1, int num2){
        return num1 + num2;
    }

    //3) Crie o método maior() na classe Calculadora para aceitar três números como parâmetros e retornar o maior deles.
    public int maior(int num1, int num2, int num3){
        if(num1 == num2 && num1 == num3){
            return num1;
        } else if(num1 > num2 && num1 > num3){
            return num1;
        } else if(num2 > num3){
            return num2;
        } else {
            return num3;
        }
    }
}
