public class Gerador {

    
    //1) Crie um programa que tenha uma classe Gerador com um método estático gerador() que, quando chamado, exiba a mensagem "Olá, Mundo!" com algum componente visual, como uma linha decorativa.
    public static String gerador(){
        StringBuilder sb = new StringBuilder();
        sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        sb.append("                   Olá, Mundo!\n");
        sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        return sb.toString();
    }

    //2) Melhore o método gerador() da classe Gerador para aceitar uma mensagem personalizada como parâmetro e exibi-la com a mesma estilização visual.
    public static String gerador(String mensagem){
        StringBuilder sb = new StringBuilder();
        sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        sb.append(mensagem + "\n");
        sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        return sb.toString();
    }

    //3) Adicione à classe Gerador um método sobrecarregado gerador() que aceite uma mensagem personalizada e um número inteiro como parâmetros, e exiba a mensagem repetidas vezes, conforme o número fornecido.
    public static String gerador(String mensagem, int count){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append(mensagem + "\n");
        }
        return sb.toString();
    }

    //4) Ainda na classe Gerador, crie um método sobrecarregado gerador() que permita escolher entre três tipos de bordas diferentes para exibir a mensagem personalizada.
    public static String gerador(int tipo, String mensagem){
        StringBuilder sb = new StringBuilder();
        if(tipo == 1){
            sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
            sb.append(mensagem + "\n");
            sb.append("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        } else if (tipo == 2) {
            sb.append("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-\n");
            sb.append(mensagem + "\n");
            sb.append("-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-");
        } else if (tipo == 3){
            sb.append("-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-\n");
            sb.append(mensagem + "\n");
            sb.append("-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-");
        } else {
            sb.append("Valor de escolha de borda inválido.");
        }
        return sb.toString();
    }
}
