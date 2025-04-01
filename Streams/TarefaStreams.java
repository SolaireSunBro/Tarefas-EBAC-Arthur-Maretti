package Ebac.Streams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TarefaStreams {

// String teste
// joao-M,Josefino-M,Mia-F,Bruna-F,Arnold-M,Priscilla-F,Jairo-M
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----------Recebendo a lista------------");
        System.out.println("\nDigite os nomes separados por virgula");
        String input = sc.nextLine();

        List<String> lista = List.of(input.split(","));

        lista.forEach((String s) ->System.out.println(s));
        System.out.println("\n");

        Stream streamMulheres = lista.stream()
                .filter(listaF -> listaF.contains("F"));

        System.out.println("---Lista Mulheres---");
        streamMulheres.forEach(i ->System.out.println());


    }
}
