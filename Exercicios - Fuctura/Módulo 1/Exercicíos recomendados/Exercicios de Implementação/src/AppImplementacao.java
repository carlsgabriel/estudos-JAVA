public class AppImplementacao {

    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();

        System.out.println("Classe Gerador");
        System.out.println(Gerador.gerador());
        System.out.println("\n");
        System.out.println(Gerador.gerador("Testando o método gerador com sobrecarga para String"));
        System.out.println("\n");
        System.out.println(Gerador.gerador("Testando sobrecarga com String e int", 3));
        System.out.println("\n");
        System.out.println(Gerador.gerador(2, "Testando borda da sobrecarga int e String"));

        System.out.println("\n\n");

        System.out.println("Classe Calculadora");
        System.out.println(calculadora.maior(1, 2, 3));

        System.out.println("\n\n");

        System.out.println("Classe Verificador");
        System.out.println(Verificador.verificarParOuImpar(2638472));

        System.out.println("\n\n");

        System.out.println("Classe Contador");
        System.out.println(Contador.contar(1, 10, 2));

        System.out.println("\n\n");

        System.out.println("Classe Fibonacci");
        System.out.println(Fibonacci.gerarSequencia(5));

    }

}