package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a quantidade de linhas da matriz: ");
        int linhas = scan.nextInt();
        System.out.print("Insira a quantidade de colunas da matriz: ");
        int colunas = scan.nextInt();

        System.out.println();
        int[][] mat = new int[linhas][colunas];
        System.out.println("Insira os números que vão preencher a matriz, espaçando-os com um espaço em branco, assim: x x x");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.print("Insira um número qualquer, se este existir dentro da matriz, será exibido os números ao seu redor: ");
        int n = scan.nextInt();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == n){
                    System.out.println("Position " + i + ", " + j + ":");
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i < mat.length -1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        /*
        j > 0 = Se a coluna for maior que 0, então o programa pode "voltar" 1 posição (pra esquerda) sem exceder o limite do matriz.
        i > 0 = Se a linha for maior que 0, então o programa pode "voltar" 1 posição (pra cima) sem exceder o limite do matriz.
        j < mat[i].length -1 = Se a atual coluna for menor do que a coluna de número máximo da matriz, então o programa pode "avançar" uma posição (pra direita) sem exceder o limte do matriz.
        i < mat.length -1 = Se a atual linha for menor do que a coluna de número máximo da matriz, então o programa pode "avançar" uma posição (pra baixo) sem exceder o limite da matriz.

        Apenas verificar os números ao redor, vendo se eram maiores que 0, como fiz antes, não funciona.
        Dessa forma até números negativos podem ser exibidos.
         */


        scan.close();
    }
}
