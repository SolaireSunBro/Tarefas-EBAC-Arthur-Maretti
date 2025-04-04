import Ebac.TesteLista.Demo;
import Ebac.TesteLista.Pessoa;

import org.junit.Test;

import java.util.List;


import static org.junit.Assert.assertTrue;

public class TarefaTeste {

   @Test
    public void testsLista(){

       List<Pessoa> pessoas = List.of(new Pessoa("Bruno-M,Sara-F,Joyce-F,Ronnie-M,Gabriela-F"));
       //List<Pessoa> pessoas = List.of(new Pessoa("Bruno-M,Ronnie-M"));
       Demo.filtrarMulheres(pessoas);
       boolean temMulher = pessoas.stream()
               .anyMatch(p -> p.getNome().contains("F"));
       assertTrue( "A lista deveria conter pelo menos uma mulher.",temMulher);
   }



}
