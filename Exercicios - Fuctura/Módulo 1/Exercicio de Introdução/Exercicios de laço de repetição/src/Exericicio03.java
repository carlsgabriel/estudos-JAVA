import java.util.Scanner;

public class Exericicio03 {

    public static void main(String[] args){

        /*Crie um programa que receba um número inteiro e calcule a soma dos seus dígitos.*/


        /*Explicação da lógica:
          - Você consegue obter o ultimo dígito do numero inserido se pegar o valor do resto da divisão dele por 10... por exemplo: 43 % 10 -> 3. Viu?
          - Beleza, agora que você pegou o ultimo dígito você precisa adicionar isso a soma.
          - Depois que adicionou, o número que você recebeu tem que "perder" uma casa dígito já que a gente já sabe qual é... e pra isso se divide ele por 10. 43/10 -> 4.
          - Isso vai acontecer até que ele seja um número de apenas um digito. Quando isso acontecer o resto da divisão vai ser ele mesmo.
          - Essa repetição muito provavelmente vai acontecer em algum laço...
          - E pra que o laço não continue sendo executado depois de se tornar um número com apenas 1 digito, você pode usar a condição: numero > 0.
                 Pois pense no nosso exemplo, número agora é 4, se você dividir por 10 vai dar 0.alguma coisa... ou seja, 0.
                 Nosso loop deve morrer ai.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o numero desejado: ");
        int num = scan.nextInt();
        int registroNum = num;

        int soma = 0;

        while(num > 0){
            int digito = num % 10;
            soma += digito;

            num /= 10;
        }

        System.out.println("O valor da soma dos digitos (" + registroNum + ") é: " + soma);

        scan.close();

    }

}
