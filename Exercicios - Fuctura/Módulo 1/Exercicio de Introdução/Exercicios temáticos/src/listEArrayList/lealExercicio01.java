import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lealExercicio01 {

    public static void main(String[] args){

    /*Dona Cremilda quer organizar sua lista de compras.
    Crie um programa que permita adicionar itens a uma lista, remover itens e exibir a lista atualizada para Dona Cremilda revisar antes de ir às compras.*/
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Quer adicionar itens na lista de contas [s/n]? ");
        char opcao = scan.next().charAt(0);
        scan.nextLine();

        List<String> list = new ArrayList<>();

        if(opcao == 's'){
            while(opcao != 'n'){

                System.out.print("Que item você deseja adicionar na lista de compras? ");
                String item = scan.nextLine();
                list.add(item);

                System.out.println();
                System.out.print("Quer adicionar mais algum item [s/n]? ");
                opcao = scan.next().charAt(0);
                scan.nextLine();
            }
        } else {
                System.out.println("Tudo bem, programa finalizado.");
                return; 
                /*Ao usar um return, o método retornará algo.
                Porém também há uma coisa a mais: Depois do return o método "morre", pois o que estiver depois do return é totalmente ignorado.
                Como estamos dentro do método main(), return vai se referir a ele e por consequencia, ao usarmos o return aqui nessa linha 
                e o código chegar aqui, todo o resto do código será ignorado.
                */
        }

        System.out.print("Quer remover algum item [s/n]? ");
        opcao = scan.next().charAt(0);
        scan.nextLine();

        if(opcao == 's'){
            while(opcao != 'n'){

                System.out.println("Que item você deseja remover da lista? ");
                System.out.print("Insira o nome do item que você deseja remover: ");
                String item = scan.nextLine();
                list.remove(item);

                System.out.println();
                System.out.print("Quer remover mais algum item [s/n]? ");
                opcao = scan.next().charAt(0);
                scan.nextLine();
            }
        } else {
            System.out.println("Tudo bem, vamos prosseguir.");
        }

        System.out.println();

        System.out.println("Em sua lista há os itens abaixo: ");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1) + ". " + list.get(i));
        }
        
        scan.close();

    }

}