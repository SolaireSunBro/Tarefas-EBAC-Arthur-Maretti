package Ebac.Annotations;

public class TabelaReflection {

public static void main(String[] args){

        Class<?> clazz = TabelaAnnotations.class;

        System.out.println(clazz);
        System.out.println(clazz.getSimpleName() +"\n");

        System.out.println("----Lendo em tempo de execucao---- \n");

        NomeTabela tbname = clazz.getAnnotation(NomeTabela.class);
        System.out.println(tbname.value());
        System.out.println(tbname.nomeNovo());





    }
}
