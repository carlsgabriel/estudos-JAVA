public class CalculadoraAlunoRefatoramento {

        //2) Crie uma classe CalculadoraAluno com um método calcularMedia() que receba as duas notas de um aluno como parâmetros e retorne a sua média.
    public double calcularMedia(double num1, double num2){
        double media = (num1 + num2) / 2;
        return media;
    }

    //6) Melhore o método calcularMedia() da classe CalculadoraAluno criando além da função calcularMedia() uma outra função chamada verificarSituacao() que, a partir da média, retorne se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
    public String verificarSituacao(double media){
        if(media < 0 || media > 10){
            return "Média inválida.";
        } else if(media <= 4){
            return "REPROVADO.";
        } else if (media < 7){
            return "RECUPERAÇÃO.";
        } else {
            return "APROVADO.";
        }
    }

}
