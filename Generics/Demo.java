package Ebac.Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args){

        List<ListaCarros> lista= new ArrayList<>();
        lista.add(new Carro_Chevy());
        lista.add(new Carro_Honda());
        lista.add(new Carro_Volks());

        imprimirLista(lista);

    }
    public static void imprimirLista(List<ListaCarros> lista){

        for(ListaCarros carros :lista){

            System.out.println(carros);
        }
    }
}
