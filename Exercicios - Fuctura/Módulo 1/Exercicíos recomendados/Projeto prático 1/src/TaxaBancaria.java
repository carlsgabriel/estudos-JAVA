public enum TaxaBancaria {

    /*
     * O que acontece aqui é o seguinte:
     * 1. Cada constante do enum tem um valor associado, que é o que está dentro dos
     * ()
     * depois do nome dela.
     * 2. Se você apenas inserir os parênteses com os valores dentro, sem
     * construtor,
     * não irá dar certo pois esses valores associados a essas constantes são
     * passados para o construtor, então você tem que criar um construtor.
     * 3. A variável valor serve para armazenar o valor da constante enum. Tipo: Se
     * for
     * preciso utilizar a constante TAXA_DE_SAQUE e seu valor, a variável valor irá
     * obter o valor da constante e você poderá mostra-lo no get.
     * 4. O construtor vai adicionar o valor da constante na variavel valor.
     * 5. O get mostrará o valor associado àquela constante.
     *
     * Depois que um objeto desta classe enum for criado, isso é o que acontecerá:
     * taxaBancaria.TAXA_DE_SAQUE.getValor();
     * 1. O objeto desta classe será acionado, você irá acessar a constante
     * TAXA_DE_SAQUE
     * 2. O valor associado a ela vai ser passado no construtor e será armazenado em
     * valor
     * 3. e com o getValor() você obterá o valor associado a ela.
     */

    TAXA_SAQUE(5.0),
    TARIFA_MENSAL(30.0);

    private final double valor;

    private TaxaBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
