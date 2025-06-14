import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AppAvancadosListas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        List<Integer> listInteger = new ArrayList<>();
        List<Integer> listInteger2 = new ArrayList<>();
        List<Integer> listInteger3 = new ArrayList<>();
        List<Integer> listInteger4 = new ArrayList<>();
        List<Integer> listInteger5 = new ArrayList<>();
        List<Integer> listInteger6 = new ArrayList<>();
        List<Integer> listInteger7 = new ArrayList<>();
        List<Integer> listInteger8 = new ArrayList<>();
        List<Integer> listInteger9 = new ArrayList<>();
        List<Integer> listInteger10 = new ArrayList<>();
        List<Integer> listInteger11 = new ArrayList<>();
        List<Integer> listInteger12 = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Double> listDouble2 = new ArrayList<>();
        List<String> listString = new ArrayList<>();
        List<String> listString2 = new ArrayList<>();
        List<String> listString3 = new ArrayList<>();
        List<Character> listChar = new ArrayList<>();

        /*
         * Faça um programa que preencha automaticamente uma lista com 8
         * posições, conforme abaixo:
         * Valores → 999 999 999 999 999 999 999 999
         * Posições → 0 1 2 3 4 5 6 7
         */
        System.out.println("Exercicio 1º - Preencher as 8 primeiras posições da list com 999");
        for (int i = 0; i < 8; i++) {
            listInteger.add(999);
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que preencha automaticamente (usando lógica, não apenas
         * atribuindo diretamente) uma lista com 10 posições, conforme abaixo:
         * Valores → 5 10 15 20 25 30 35 40 45 50
         * Posições → 0 1 2 3 4 5 6 7 8 9
         */
        System.out.println(
                "Exercicio 2º - Preencher as 10 primeiras posições de uma outra list com valores que começam em 5 e aumentam de 5 em 5");
        for (int i = 1; i <= 10; i++) {
            listInteger2.add(i * 5);
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger2.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger2.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que preencha automaticamente (usando lógica, não apenas
         * atribuindo diretamente) uma lista com 10 posições, conforme abaixo:
         * Valores → 9 8 7 6 5 4 3 2 1 0
         * Posições → 0 1 2 3 4 5 6 7 8 9
         */
        System.out
                .println("Exercicio 3º - Preencher as 10 primeiras posições da lista com o valor decrescente de 9 - 0");
        for (int i = 9; i >= 0; i--) {
            listInteger3.add(i);
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger3.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger3.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que preencha automaticamente (usando lógica, não apenas
         * atribuindo diretamente) uma lista com 10 posições, conforme abaixo:
         * Valores → 5 3 5 3 5 3 5 3 5 3
         * Posições → 0 1 2 3 4 5 6 7 8 9
         */
        System.out.println(
                "Exercicio 4º - Preencher as 10 primeiras posições da list com os valores: 5 3 5 3 5 3 5 3 5 3");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                listInteger4.add(5);
            } else {
                listInteger4.add(3);
            }
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger4.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger4.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que preencha automaticamente (usando lógica, não apenas
         * atribuindo diretamente) uma lista com 16 posições com os primeiros
         * elementos da sequência de Fibonacci:
         * Valores → 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
         * Posições → 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
         */
        System.out.println(
                "Exercicio 5º - Preencher as 16 primerias posições da list com os valores da sequencia de Fibonacci");

        int a = 1;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < 16; i++) {
            listInteger5.add(a);
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger5.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger5.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que preencha automaticamente uma lista com 7
         * números gerados aleatoriamente pelo computador e depois mostre os valores
         * gerados na tela.
         */
        System.out.println("Exercicio 6º - Lista de 7 posições com valores gerados aleatoriamente");
        for (int i = 0; i < 7; i++) {
            listInteger6.add(random.nextInt(1000));
        }

        System.out.println();

        System.out.println("Resultado:");
        for (int i = 0; i < listInteger6.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger6.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Faça um programa que leia 7 nomes de pessoas e guarde-os em uma lista. No
         * final, mostre uma listagem com todos os nomes informados, na ordem inversa
         * daquela em que eles foram informados.
         */
        System.out.println(
                "Exercicio 7º - Lista de 7 posições com com nomes inseridos pelo usuário, sendo exibida na ordem inversa dos valores que recebeu.");

        System.out.println();

        System.out.println("Insira um nome por vez e dê enter.");
        for (int i = 0; i < 7; i++) {
            System.out.print(i + 1 + "º: ");
            listString.add(scan.nextLine());
        }

        System.out.println();

        Collections.reverse(listString);

        System.out.println("Resultado:");
        for (int i = 0; i < listString.size(); i++) {
            System.out.print((i + 1) + "º: " + listString.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Escreva um programa que leia 15 números e guarde-os em uma lista. No final,
         * mostre toda a lista na tela e em seguida mostre em que posições foram
         * digitados valores que são múltiplos de 10.
         */
        System.out.println(
                "Exercicio 8º - Lista de 15 posições com valores inseridos pelo usuário, exibindo também os multiplos de 10");

        System.out.println();

        List<Integer> pos = new ArrayList<>();
        System.out.println("Insira um número por vez e dê enter.");
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + "°: ");
            listInteger7.add(scan.nextInt());
            if (listInteger7.get(i) % 10 == 0) {
                pos.add(i + 1);
            }
        }

        System.out.println();

        System.out.println("Resultado ");
        for (int i = 0; i < listInteger7.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger7.get(i) + "   ");
        }

        System.out.println();

        System.out.println("\nPosição dos divisiveis por 10:");
        if (pos.size() != 0) {
            for (int i = 0; i < pos.size(); i++) {
                System.out.println("Posição " + (pos.get(i)));
            }
        } else {
            System.out.println("Não há nenhum número divisível por 10.");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Desenvolva um programa que leia 10 números inteiros e guarde-os em uma lista.
         * No final, mostre quais são os números pares que foram digitados e em que
         * posições eles estão armazenados.
         */
        System.out.println(
                "Exercicio 9º - Lista de 10 posições, posição dos números pares e quais são os números pares.");

        System.out.println();

        System.out.println("Insira um número por vez e dê enter.");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º: ");
            listInteger8.add(scan.nextInt());
        }

        System.out.println();

        System.out.println("Posições e valores dos números que são pares:");
        for (int i = 0; i < listInteger8.size(); i++) {
            if (listInteger8.get(i) % 2 == 0) {
                System.out.println("Posição: " + (i + 1) + " - Valor: " + listInteger8.get(i));
            }
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Faça um algoritmo que preencha uma lista de 30 posições com números entre 1 e
         * 15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
         * número (chave) e seu programa deve mostrar em que posições essa chave foi
         * encontrada. Mostre também quantas vezes a chave foi sorteada.
         */
        System.out.println(
                "Exercicio 10º - Lista de 30 posições com números aleatórios de 1-15.");

        System.out.println();

        for (int i = 0; i < 30; i++) {
            listInteger9.add(random.nextInt(15) + 1);
        }

        for (int i = 0; i < listInteger9.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger9.get(i) + "   ");
        }

        System.out.println();

        a = 0;
        System.out.print("\nDigite um número para ver se ele existe dentro da lista: ");
        a = scan.nextInt();

        if (listInteger9.contains(a)) {
            System.out.println("Posição onde o número inserido foi encontrado: ");
            for (int i = 0; i < listInteger9.size(); i++) {
                if (listInteger9.get(i) == a) {
                    System.out.println("Posição: " + (i + 1));
                }
            }
        } else {
            System.out.println("Esse número não está na lista.");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Crie um programa que leia a idade de 8 pessoas e guarde-as em uma lista.
         * No final, mostre:
         * a) Qual é a média de idade das pessoas cadastradas
         * b) Em quais posições temos pessoas com mais de 25 anos
         * c) Qual foi a maior idade digitada (podem haver repetições)
         * d) Em que posições digitamos a maior idade
         */
        System.out.println(
                "Exercicio 11º - Ler idades 8 idade e exibir: Média, posições, qual foi a maior idade e a posição..");

        System.out.println();

        a = 0;
        b = 0;
        c = 0;
        int d = 0;
        System.out.println("Insira um número por vez pressione enter: ");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "º: ");
            listInteger10.add(scan.nextInt());

            // soma media idade
            a += listInteger10.get(i);

            // quantas pessoas tem mais de 25 anos
            if (listInteger10.get(i) > 25) {
                b++;
            }

            // maior idade
            if (listInteger10.get(i) > c) {
                c = listInteger10.get(i);
                d = i + 1;
            }

        }

        System.out.println();

        System.out.println("Lista:");
        for (int i = 0; i < listInteger10.size(); i++) {
            System.out.print((i + 1) + "º: " + listInteger10.get(i) + "   ");
        }

        System.out.println();

        // media
        double media = a / 8;
        System.out.println("\nMédia das idades inseridas: " + media);

        System.out.println("\nMais de 25 anos:");
        if (b > 0) {
            for (int i = 0; i < listInteger10.size(); i++) {

                if (listInteger10.get(i) > 25) {
                    System.out.println("Posição: " + (i + 1));
                }
            }
        }

        System.out.println();

        System.out.println("Maior idade digitada: " + c);

        System.out.println("Posição da maior idade digitada: " + d);

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*
         * Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
         * uma lista. No final, mostre:
         * a) Qual é a média da turma
         * b) Quantos alunos estão acima da média da turma
         * c) Qual foi a maior nota digitada
         * d) Em que posições a maior nota aparece
         */
        System.out.println(
                "Exercicio 12º - Ler 10 notas e exibir: Média, quantos estão acima da média, qual foi a maior nota e a posição..");

        System.out.println();

        a = 0;
        media = 0.0;
        double aDouble = 0;
        double bDouble = 0;
        System.out.println("Insira uma nota por vez e pressione enter: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º: ");
            listDouble.add(scan.nextDouble());

            // soma media da turma
            aDouble += listDouble.get(i);

            // acima da media
            if (listDouble.get(i) > 7) {
                a++;
            }

            // maior nota digitada
            if (listDouble.get(i) > bDouble) {
                bDouble = listDouble.get(i);
            }

        }

        System.out.println();

        System.out.println("Lista:");
        for (int i = 0; i < listDouble.size(); i++) {
            System.out.print((i + 1) + "º: " + listDouble.get(i) + "   ");
        }

        System.out.println();

        // media da turma
        media = aDouble / 10;
        System.out.println("\nMédia das idades inseridas: " + media);

        System.out.println("\nQuantidade de pessoas acima da média: " + a);

        System.out.println("\nNota mais alta: " + bDouble);

        System.out.println();

        System.out.println("Posições em que a nota mais alta se encontra: ");
        if (listDouble.contains(bDouble)) {
            for (int i = 0; i < listDouble.size(); i++) {
                if (listDouble.get(i) == bDouble) {
                    System.out.println("Posição " + (i + 1));
                }
            }
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*Desafio:
        Crie uma lógica que preencha uma lista de 20 posições com números aleatórios (entre 0 e 99) gerados pelo computador. 
        Logo em seguida, mostre os números gerados e depois coloque a lista em ordem crescente, mostrando no final os valores ordenados.
        */
        System.out.println(
                "DESAFIO - Criar uma lista com 20 posições, preenche-la com valores aleatorios de 0-99 e ordena-los.");

        System.out.println();

        for(int i=0;i<20;i++){
            listInteger11.add(random.nextInt(100));
        }

        System.out.println("Lista antes da ordenação:");
        for(int i=0;i<listInteger11.size();i++){
            System.out.print((i+1) + "º: " + listInteger11.get(i) + "   ");
        }

        System.out.println("");

        Collections.sort(listInteger11);
        System.out.println("\nLista depois da ordenação: ");
        for(int i=0;i<listInteger11.size();i++){
            System.out.print((i+1) + "º: " + listInteger11.get(i) + "   ");
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses valores em duas listas, em posições relacionadas.
        No final, mostre uma listagem contendo apenas os dados das pessoas menores de idade. */
        System.out.println(
                "Exercicio 13º - Criar duas listas, uma com nome e outra com idade, e ler os dados do usuários em posições relacionadas. Depois, exibir apenas os dados das pessoas que são menos de idade.");

        System.out.println();


        for(int i=0;i<9;i++){
            scan.nextLine();
            System.out.println("--------------------");
            System.out.print("Insira seu nome: ");
            listString2.add(scan.nextLine());
            System.out.print("Insira sua idade: ");
            listInteger12.add(scan.nextInt());
        }

        System.out.println();

        System.out.println("\nDados das pessoas que são menores: ");
        for(int i=0;i<listInteger12.size();i++){
            if(listInteger12.get(i) < 18){
                System.out.println("Nome: " + listString2.get(i) + " - Idade: " + listInteger12.get(i));
            }
        }

        System.out.println(
                "\n__________________________________________________________________________________________\n");

        /*Faça um algoritmo que leia o nome, o gênero e o salário de 5 funcionários e guarde esses dados em três listas. 
        No final, mostre uma listagem contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/
        System.out.println(
                "Exercicio 14º - Ler os dados de nome, genêro e salário do funcionário em três listas diferentes. Exibir apenas os dados dos funcionarios do genero feminino e com uma salário maior que 5000.");

        System.out.println();

        for(int i=0;i<5;i++){
            scan.nextLine();
            System.out.println("-------------");
            System.out.print("Nome: ");
            listString3.add(scan.nextLine());
            System.out.print("Genêro [m/f]: ");
            listChar.add(scan.next().charAt(0));
            System.out.print("Salário: R$");
            listDouble2.add(scan.nextDouble());
        }

        System.out.println();

        System.out.println("Mulheres que ganham mais de R$5000:");
        if(listChar.contains('f') || listChar.contains('F')){
                for(int i=0;i<listString3.size();i++){
                    if((listChar.get(i) == 'f' || listChar.get(i) == 'F') && listDouble2.get(i) > 5000){
                        System.out.println("Nome: " + listString3.get(i) + " - Salário: R$" + listDouble2.get(i));
                }
            }
        } else {
            System.out.println("Não há mulheres que recebem mais que R$5000.");
        }


        scan.close();

    }

}
