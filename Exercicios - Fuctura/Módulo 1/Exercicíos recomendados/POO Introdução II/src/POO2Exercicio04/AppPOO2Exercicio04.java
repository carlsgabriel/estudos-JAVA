package POO2Exercicio04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppPOO2Exercicio04 {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("DADOS DO ANIMAL");
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.print("Espécie: ");
        String especie = scan.nextLine();

        System.out.print("Raça: ");
        String raca = scan.nextLine();

        System.out.print("Porte: ");
        String porte = scan.nextLine();

        System.out.print("Sexo [macho ou femea]: ");
        String sexo = scan.nextLine();

        AnimalEstimacao animalEstimacao = new AnimalEstimacao();
        animalEstimacao.setNome(nome);
        animalEstimacao.setIdade(idade);
        animalEstimacao.setEspecie(especie);
        animalEstimacao.setRaca(raca);
        animalEstimacao.setPorte(porte);
        animalEstimacao.setSexo(sexo);

        boolean continuar = true;
        do{

            System.out.println("\nMENU");
            System.out.println("1. ALIMENTAR ANIMAL");
            System.out.println("2. BRINCAR");
            System.out.println("3. LEVAR AO VETERINÁRIO");
            System.out.println("4. PASSEAR");
            System.out.println("5. DAR BANHO");
            System.out.println("6. TREINAR");
            System.out.println("7. VERIFICAR FELICIDADE");
            System.out.println("8. SAIR DO MENU");
            System.out.print("Escolheu a opção: ");
            int op = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch(op) {
                case 1 -> System.out.println(animalEstimacao.alimentar());
                case 2 -> System.out.println(animalEstimacao.brincar());
                case 3 -> {
                    System.out.println("Insira abaixo a data que você deseja ir ao veterinário, nesse formato: dia/mes/ano");
                    System.out.print("Data escolhida: ");
                    String dataVet = scan.nextLine();
                    date = sdf.parse(dataVet);

                    System.out.println(animalEstimacao.levarAoVeterinario(date));
                }
                case 4 -> System.out.println(animalEstimacao.passear());
                case 5 -> System.out.println(animalEstimacao.darBanho());
                case 6 -> System.out.println(animalEstimacao.treinar());
                case 7 -> {
                    System.out.println("Seu cachorro está animado, com energia, brincando, comendo bem e abanando o rabo na maior parte do tempo?");
                    System.out.print("Responda com sim ou nao: ");
                    String opcaoFelicidade = scan.nextLine();

                    System.out.println(animalEstimacao.verificarFelicidade(opcaoFelicidade));
                }
                case 8 -> {
                    System.out.println("Saindo do menu...");
                    return;
                } 
                default -> System.out.println("Valor inválido.");
            }

            System.out.println("Deseja continuar no menu?");
            System.out.println("1. SIM");
            System.out.println("2. NAO");
            System.out.print("Opção desejada: ");
            int opContinuar = scan.nextInt();

            if(opContinuar == 1){
                continuar = true;
            } else {
                continuar = false;
            }

        }while(continuar != false);

        scan.close();

    }

}
