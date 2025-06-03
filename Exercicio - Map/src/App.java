import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //LinkedHashMap para ordenar os itens com base na ordem em que foram adicionados ao Map.
        Map<String, Integer> votation = new LinkedHashMap<>();

        System.out.print("Enter the full path: ");
        String userPath = scan.nextLine();
        File path = new File(userPath);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] vect = line.split(",");
                String name = vect[0];
                int votes = Integer.parseInt(vect[1]);

                /*Se esse elemento já existe no Map, então:
                Ir no map -> Pegar o valor desse elemento já existente (Map.get()) e armazenar em alguma variável ->
                Adicionar novamente ao Map o mesmo elemento (para que o novo valor substitua o antigo)
                só que adicionando ao novo valor a soma do valor já existente.
                Assim o valor daquela chave será substituido, só que será com a soma do valor antigo.
                */
                if(votation.containsKey(name)){
                    int aux = votation.get(name);
                    votation.put(name, votes + aux);
                } else {
                    votation.put(name, votes);
                }

                line = br.readLine();
            }
            for(String key : votation.keySet()){
                System.out.println(key + " - " + votation.get(key));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        scan.close();

    }
}
