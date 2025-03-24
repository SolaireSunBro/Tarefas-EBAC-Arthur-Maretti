package Ebac.Annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface NomeTabela {

    String value();
}
