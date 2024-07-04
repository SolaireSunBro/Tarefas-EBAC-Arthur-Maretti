import java.util.*;

public class Ordenacao {

    public static void main(String[] args) {
        lendoLista();
        ordenandoPorSexo();
    }

    public static void lendoLista(){
        Scanner sc = new Scanner(System.in);
        List<String> vtr = new ArrayList<>();
        int j=1;

        System.out.println("\n-----------Recebendo a lista------------");

        for (int i=0; i<4; i++) {

            System.out.println("\nNome "+ j +"=");
            vtr.add(sc.next()); j++;

        }
        System.out.println("\nLista" + vtr);

        ordenacaoLista(vtr);

    }
    public static void ordenandoPorSexo() {
        Scanner sc = new Scanner(System.in);
        String nome;
        int i=0,j =0;

        System.out.println("\n-----------Separando por sexo-----------");
        System.out.println("\nQuantos nomes ? ");
        int tamanho = sc.nextInt();
        String[] masc = new String[tamanho];
        String[] fem = new String[tamanho];

        sc.nextLine();

        System.out.println("\nInsira todos os nomes com o sexo(separados por - ) = ");
        nome = sc.nextLine();
        String[] partes = nome.split(",");

        for (tamanho = 0; tamanho < partes.length; tamanho++) {
            if (partes[tamanho].contains("M")||partes[tamanho].contains("m")) {
                masc[i] = partes[tamanho];
                i++;
            } else {
                fem[j] = partes[tamanho];
                j++;
            }
        }


        System.out.println("----Nomes----\n");
        for (i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);

        }
        System.out.println("----Homens----\n");
        for (i = 0; i < masc.length; i++){
            System.out.println(masc[i]+"\t");
            if(masc[i+1]==null)break;

    }
        System.out.println("----Mulheres----\n");
        for(i=0;i<fem.length;i++ ) {
                System.out.println(fem[i] + "\t");
                if(fem[i+1]==null)break;


        }


    }

    public static void ordenacaoLista(List str){
        System.out.println("\n-----------Ordenando a lista------------");
        Collections.sort(str);
        System.out.println("\nLista Ordenada" + str);

    }

}

