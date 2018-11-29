package zc.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapUtils {
    public static Object mapToObject(Map<String,Object> map, Class<?> beanClass){
        try {
            Object object=beanClass.newInstance();
            if (map!=null){
                Field[] fields=object.getClass().getDeclaredFields();
                for (Field field:fields){
                    int mod=field.getModifiers();
                    if (Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                        continue;
                    }
                    field.setAccessible(true);
                    field.set(object,map.get(field.getName()));
                    field.setAccessible(false);
                }
            }
            return object;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String,Object> objectToMap(Object object){
        Map<String,Object> map=new HashMap<String, Object>();
        if (object!=null){
            Field[] declaredFileds=object.getClass().getDeclaredFields();
            for (Field field:declaredFileds){
                field.setAccessible(true);
                try {
                    map.put(field.getName(),field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }finally {
                    field.setAccessible(false);
                }
            }
        }
        return map;
    }

    public static Map<String,Object> objectToMapOrdered(Object object){
        Map<String,Object> map=new TreeMap<String, Object>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        if (object!=null){
            Field[] declaredFileds=object.getClass().getDeclaredFields();
            for (Field field:declaredFileds){
                field.setAccessible(true);
                try {
                    map.put(field.getName(),field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }finally {
                    field.setAccessible(false);
                }
            }
        }
        return map;
    }
}
