package POO2Exercicio04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalEstimacao {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private Integer idade;
    private String especie;
    private String raca;
    private String porte;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String alimentar() {
        return "Você alimentou " + nome + ".\n";
    }

    public String brincar() {
        if(sexo.equalsIgnoreCase("macho")){
            return "Você brincou com " + nome + " e ele ficou muito feliz.\n";
        } else {
            return "Você brincou com " + nome + " e ela ficou muito feliz.\n";
        }
        
    }

    public String levarAoVeterinario(Date data) {
        return "Você agendou uma ida ao veterinário no dia " + sdf.format(data) + ".\n";
    }

    public String passear() {
        return "Você levou " + nome + " para passear ao ar livre.\n";
    }

    public String darBanho() {
        return "Você deu banho em " + nome + ".\n";
    }

    public String treinar() {
        return "Você ensinou comandos básicos a " + nome + " em troca de petiscos.\n";
    }

    public String verificarFelicidade(String sinal) {
        if(sinal.equals("sim") || sinal.equals("SIM")) {
            return "Muito provavelmente " + nome + " está feliz.\n";
        } else {
            return "Muito provavelmente " + nome + " está triste.\n";
        }
    }

}
