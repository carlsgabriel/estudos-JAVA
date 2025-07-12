package POO2Exercicio08;

import java.util.Scanner;

public class AppPOO2Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FiguraGeometrica figura = null;

        System.out.println("Tipos de figuras que podem ser criadas:");
        System.out.println("1. TRIÂNGULO");
        System.out.println("2. CÍRCULO");
        System.out.println("3. RETÂNGULO");
        System.out.print("Opção desejada: ");
        int opcao = scan.nextInt();

        System.out.println();

        /*
         * Aqui vai acontecer um caso de polimorfismo:
         * FiguraGeometrica é uma classe abstrata que só tem os métodos calcularAreaa(),
         * calcularPerimetro() e desenharFigura()
         * Existe o upcasting, que é quando uma variável do tipo superclasse pode
         * receber uma variável do tipo subclasse dentro dela.
         * Porém essa variável do tipo superclasse que possui uma variável do tipo
         * subclasse dentro dela só pode ter acesso aos dados da subclasse ou executar
         * métodos que também
         * existam na superclasse...
         * Ou seja, a variável figura terá acesso ou poderá executar apenas os 3 métodos
         * que também existem nela, na subclasse dentro dela... os
         * getters e setters, e os atributos não poderão ser acessados.
         * Por isso que primeiro se cria a varíavel do tipo específico, recebe todos os
         * dados nela e só depois que ela está completa é que ela é atribuida a variavel
         * figura...
         * Se você fizesse isso antes, não teria como da variável figura você conseguir
         * fazer as coisas.
         * No final de tudo, acaba que figura tem uma variável do tipo específico dentro
         * dela
         * e por ter acesso aos 3 métodos (pois nela também tem), ela consegue acessar
         * os da classe especifica e executa-los.
         * Com isso funciona o que a gente quer.
         */
        switch (opcao) {
            case 1 -> {
                Triangulo triangulo = new Triangulo();
                System.out.print("Insira o valor da base do triângulo: ");
                triangulo.setBase(scan.nextDouble());

                System.out.print("Insira o valor da altura do triângulo: ");
                triangulo.setAltura(scan.nextDouble());

                System.out.print("Insira o valor do lado A do triângulo: ");
                triangulo.setLadoA(scan.nextDouble());

                System.out.print("Insira o valor do lado B do triângulo: ");
                triangulo.setLadoB(scan.nextDouble());

                System.out.print("Insira o valor do lado C do triângulo: ");
                triangulo.setLadoC(scan.nextDouble());

                figura = triangulo;

                System.out.println("Triângulo criado!");
            }
            case 2 -> {
                Circulo circulo = new Circulo();

                System.out.print("Insira o valor do raio do circulo: ");
                circulo.setRaio(scan.nextDouble());

                System.out.println("Circulo criado!");

                figura = circulo;

                System.out.println("Circulo criado!");
            }
            case 3 -> {
                Retangulo retangulo = new Retangulo();

                System.out.print("Insira o valor da base do retângulo: ");
                retangulo.setBase(scan.nextDouble());
                System.out.print("Insira o valor da altura do retângulo: ");
                retangulo.setAltura(scan.nextDouble());

                figura = retangulo;

                System.out.println("Retângulo criado!");

            }
            default -> System.out.println("Valor inválido.");
        }

        System.out.println();

        System.out.println("----- MENU -----");
        System.out.println("1. CALCULAR ÁREA");
        System.out.println("2. CALCULAR PERÍMETRO");
        System.out.println("3. DESENHAR FIGURA");
        System.out.println("4. SAIR DO MENU");
        System.out.print("Opção desejada: ");
        int opcaoMenu = scan.nextInt();

        System.out.println();

        switch (opcaoMenu) {
            case 1 -> {
                System.out.println("Valor da área: " + figura.calcularArea());
            }
            case 2 -> {
                System.out.println("Valor do perímetro: " + figura.calcularPerimetro());
            }
            case 3 -> {
                System.out.println(figura.desenharFigura());
            }
            case 4 -> {
                System.out.println("Saindo do menu...");
                return;
            }
            default -> System.out.println("Dados inválidos.");
        }

        scan.close();

    }

}

