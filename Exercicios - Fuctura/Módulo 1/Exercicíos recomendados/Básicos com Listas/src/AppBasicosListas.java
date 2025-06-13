import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AppBasicosListas {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        List<Integer> listInteger = new ArrayList<>();

        /*Crie uma Lista com vinte números aleatórios.*/
        for(int i=0;i<20;i++){
            listInteger.add(random.nextInt(1000));
        }

        System.out.println("1º exercicio - Lista com os 20 números aleatórios:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");


        /*Adicione o número 11 à Lista criada no exercício anterior.*/
        listInteger.add(11);

        System.out.println("2º exercicio - Resultado da lista após a adição do número 11:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Remova o número na 5ª posição da Lista.*/
        listInteger.remove(4);

        System.out.println("3º exercicio - Removendo o valor da 5º posição na lista:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15.*/
        List<Integer> novaListInteger = new ArrayList<>();
        novaListInteger.add(12);
        novaListInteger.add(13);
        novaListInteger.add(14);
        novaListInteger.add(15);

        listInteger.addAll(novaListInteger);

        System.out.println("4º exercicio - Mostrando a lista depois da concatenação com a outra lista que ia de 12-15:");
        for(int i=0;i<24;i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Encontre o comprimento da Lista resultante.*/
        System.out.println("5º exercicio - Comprimento da lista resultante: ");
        System.out.println("Tamanaho: " + listInteger.size());

        System.out.println("\n________________________________________________________________________________________\n");

        /*Verifique se o número 8 está presente na Lista.*/
        System.out.println("6º exercicio - Lista possui o número 8?");
        if(listInteger.contains(8)){
            System.out.println("A lista contém o número 8.");
        } else {
            System.out.println("A lista não possui o número 8.");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Inverta a ordem dos elementos na Lista.*/
        Collections.reverse(listInteger);
        System.out.println("7º exercicio - Invertendo a ordem dos elementos da lista.");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Remova todos os números pares da Lista.*/
        listInteger.removeIf(x -> x % 2 == 0);

        System.out.println("8º exercicio - Resultado da lista depois que todos os números pares foram removidos:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Substitua o valor da 3ª posição por 30.*/
        listInteger.set(2, 30);

        System.out.println("9º exercicio - Substituir o valor da 3º posição por 30:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println("\n________________________________________________________________________________________\n");

        /*Ordene a Lista de forma crescente.*/
        Collections.sort(listInteger);

        System.out.println("10º exercicio - Ordenar em ordem crescente a lista:");
        for(int i=0;i<listInteger.size();i++){
            System.out.print((i+1) + "º: " + listInteger.get(i) + "   ");
        }

	    scan.close();

    }

}
