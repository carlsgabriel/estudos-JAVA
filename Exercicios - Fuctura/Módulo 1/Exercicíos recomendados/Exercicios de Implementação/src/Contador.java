public class Contador {

    //Implemente na classe Contador um método estático contar() que receba três valores como parâmetros: o início, o fim e o incremento de uma contagem. O programa principal deve solicitar esses valores e passá-los ao método, que irá exibir a contagem na tela.
    public static String contar(int inicio, int fim, int incremento){
        StringBuilder sb = new StringBuilder();
        if(inicio < fim){
            for(int i=inicio;i<=fim;i+=incremento){
                sb.append(i + " ");
            }
        } else {
            for(int i=inicio;i>=fim;i-=incremento){
                sb.append(i + " ");
            }
        }
        return sb.toString();
    }

}