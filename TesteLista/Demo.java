package Ebac.TesteLista;



import java.util.*;

// String teste
// joao-M,Josefino-M,Mia-F,Bruna-F,Arnold-M,Priscilla-F,Jairo-M

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Digite os nomes");
        String input = sc.nextLine();
        List<String> lista = List.of(input.split(","));

        List<Pessoa> pessoas = new ArrayList<>();

        for (i = 0; i < lista.size(); i++) {
            pessoas.add(new Pessoa(lista.get(i)));

        }

        System.out.println("---Imprimindo a lista---");
        for (Pessoa elemento : pessoas) {
            System.out.println(elemento.getNome());
        }


        System.out.println("Mulheres:");
        List<Pessoa> listaF = filtrarMulheres(pessoas);
        for (Pessoa elemento : listaF) {
            System.out.println(elemento.getNome());
        }
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> mulheres){
        return  mulheres.stream()
                .filter(p -> p.getNome().contains("F")).toList();

    }
}
