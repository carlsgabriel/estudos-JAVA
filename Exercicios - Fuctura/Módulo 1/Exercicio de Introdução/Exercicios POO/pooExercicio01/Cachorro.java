public class Cachorro extends Animal {

    public Cachorro(String nome, String especie, int idade){
        super(nome, especie, idade);
    }

    public String latir(){
        return getNome() + " latiu!";
    }

}
