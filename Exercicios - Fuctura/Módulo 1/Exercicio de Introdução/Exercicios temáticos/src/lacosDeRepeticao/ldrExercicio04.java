import java.util.Scanner;

public class ldrExercicio04 {

    public static void main(String[] args){

        /*Crie um pequeno quiz de 5 perguntas. Cada vez que o usuário responde, o programa deve exibir a próxima pergunta e ao final mostrar o número total de acertos.*/
        
        Scanner scan = new Scanner(System.in);

        int acertos = 0;

        for(int i=1;i<=5;i++){
            if(i == 1){
                System.out.println("O que a palavra \"legend\" significa em português?");
                System.out.println("a) Legenda");
                System.out.println("b) Conto");
                System.out.println("c) História");
                System.out.println("d) Lenda");
                System.out.print("Opção escolhida: ");
                char opcao = scan.next().charAt(0);
                System.out.println();
                if(opcao == 'd'){
                    acertos++;
                } else if (opcao == 'a' || opcao == 'b' || opcao == 'c') {
                    acertos += 0;
                } else {
                    System.out.println("Valor inválido! Essa questão não vai computar pontos.");
                    System.out.println();
                }
            } else if (i == 2) {
                System.out.println("Qual o número mínimo de jogadores em cada time numa partida de futebol?");
                System.out.println("a) 8");
                System.out.println("b) 10");
                System.out.println("c) 9");
                System.out.println("d) 7");
                System.out.print("Opção escolhida: ");
                char opcao = scan.next().charAt(0);
                System.out.println();
                if(opcao == 'd'){
                    acertos++;
                } else if (opcao == 'a' || opcao == 'b' || opcao == 'c') {
                    acertos += 0;
                } else {
                    System.out.println("Valor inválido! Essa questão não vai computar pontos.");
                    System.out.println();
                }
            } else if (i == 3){
                System.out.println("Complete o provérbio \"A cavalo dado …\"");
                System.out.println("a) sai caro");
                System.out.println("b) não se olha os dentes");
                System.out.println("c) bonito lhe parece");
                System.out.println("d) não se olha o rabo");
                System.out.print("Opção escolhida: ");
                char opcao = scan.next().charAt(0);
                System.out.println();
                if(opcao == 'b'){
                    acertos++;
                } else if (opcao == 'a' || opcao == 'c' || opcao == 'd') {
                    acertos += 0;
                } else {
                    System.out.println("Valor inválido! Essa questão não vai computar pontos.");
                    System.out.println();
                }
            } else if (i == 4) {
                System.out.println("Qual destas obras arquitetônicas brasileiras é uma das Sete Maravilhas do Mundo Moderno?");
                System.out.println("a) Elevador Lacerda");
                System.out.println("b) Estação da Luz");
                System.out.println("c) Cristo Redentor");
                System.out.println("d) Palácio da Alvorada");
                System.out.print("Opção escolhida: ");
                char opcao = scan.next().charAt(0);
                System.out.println();
                if(opcao == 'c'){
                    acertos++;
                } else if (opcao == 'a' || opcao == 'b' || opcao == 'd') {
                    acertos += 0;
                } else {
                    System.out.println("Valor inválido! Essa questão não vai computar pontos.");
                    System.out.println();
                }
            } else {
                System.out.println("Que animal gruguleja?");
                System.out.println("a) o peru");
                System.out.println("b) a garça");
                System.out.println("c) o papagaio");
                System.out.println("d) o pavão");
                System.out.print("Opção escolhida: ");
                char opcao = scan.next().charAt(0);
                System.out.println();
                if(opcao == 'a'){
                    acertos++;
                } else if (opcao == 'b' || opcao == 'c' || opcao == 'd') {
                    acertos += 0;
                } else {
                    System.out.println("Valor inválido! Essa questão não vai computar pontos.");
                    System.out.println();
                }
            }
        }

        System.out.println("Você obteve um total de " + acertos + " acertos.");

        scan.close();

    }

}