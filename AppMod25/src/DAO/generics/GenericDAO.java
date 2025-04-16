package DAO.generics;

import Annotations.TipoChave;
import Exceptions.KeyNotFound;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract  class GenericDAO<T,E>  implements IGenericDAO<T,E>{

    private SingletonDAOMap singletonMap;

    public abstract Class<T> getTipoClasse();

    public abstract void  atualizarDados(T entity, T cadastrado);


    public GenericDAO(){
        singletonMap = SingletonDAOMap.getInstance();
    }

    private Map<E, T> getMapa() {
        Map<E, T> mapaInterno = (Map<E, T>) this.singletonMap.getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.singletonMap.getMap().put(getTipoClasse(), mapaInterno);
        }
        return mapaInterno;
    }


    public E getChave(T entity) throws KeyNotFound {
        Field[] fields = entity.getClass().getDeclaredFields();
        E returnValue = null;
        for (Field field : fields) {
            if (field.isAnnotationPresent(TipoChave.class)) {
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    returnValue = (E) method.invoke(entity);
                    return returnValue;
                } catch (NoSuchMethodException | IllegalAccessException |
                         InvocationTargetException e) {
                         e.printStackTrace();
                         throw new KeyNotFound("Chave principal do objeto " + entity.getClass() + " não encontrada", e);
                }
            }
        }
        if (returnValue == null) {
            String msg = "Chave principal do objeto " + entity.getClass() + " não encontrada";
            System.out.println("**** ERRO ****" + msg);
            throw new KeyNotFound(msg);
        }
        return null;
    }


    @Override
    public Boolean cadastrar(T entity) throws KeyNotFound {
        Map<E, T> mapaInterno = getMapa();
        E chave = getChave(entity);
        if (mapaInterno.containsKey(chave)) {
            return false;
        }

        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public void alterar(T entity) throws KeyNotFound{
        Map<E, T> mapaInterno = getMapa();
        E chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if (objetoCadastrado != null) {
            atualizarDados(entity, objetoCadastrado);
        }
    }



    @Override
    public T pesquisar (E codigo){
        Map<E,T> mapaInterno = getMapa();
        return mapaInterno.get(codigo);
    }

    @Override
    public void excluir(E codigo){
        Map<E,T> mapaInterno = getMapa();
        T Obj = mapaInterno.get(codigo);
        if(Obj != null){
            mapaInterno.remove(codigo,Obj);
        }
    }


}
