import java.util.*;

public class Grupo {

    public static void main(String[] args){

        recebendoNomes();

    }

    public static void recebendoNomes(){
        Scanner sc = new Scanner(System.in);

        String nomes;

        System.out.println("Escreva o nome e o sexo separados por ','");
        nomes = sc.nextLine();
        String[] pessoas = nomes.split(",");
        separando(nomes, pessoas);
    }

    private static void separando(String nomes, String[] pessoas) {

        String [] m = new String[10] ;
        String [] f = new String[10] ;
        int i=0, j=0, tamanho;

        System.out.println(nomes);

        for( tamanho=0; tamanho< pessoas.length; tamanho++){
            if(pessoas[tamanho].contains("m") || pessoas[tamanho].contains("M")){
                m[i] = pessoas[tamanho];
                i++;
            }else{
                f[j] = pessoas[tamanho];
                j++;
            }
        }

        System.out.println("Sexo Feminino");
        for (i = 0; i < f.length; i++){
            System.out.println(f[i]+"\t");
            if(f[i+1]==null)break;

        }

        System.out.println("----Homens----\n");
        for (i = 0; i < m.length; i++){
            System.out.println(m[i]+"\t");
            if(m[i+1]==null)break;

        }



    }

}
