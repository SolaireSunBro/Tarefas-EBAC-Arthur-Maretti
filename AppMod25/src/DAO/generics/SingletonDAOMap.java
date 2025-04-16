package DAO.generics;

import java.util.HashMap;
import java.util.Map;

public class SingletonDAOMap {
    
    private static SingletonDAOMap singletonDAOMap;

    protected Map<Class,Map<?,?>> map;

    private SingletonDAOMap(){
        map = new HashMap<>();
    }

    public static SingletonDAOMap getInstance(){
        if(singletonDAOMap == null){
            singletonDAOMap = new SingletonDAOMap();
        }
        return singletonDAOMap;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }

}
