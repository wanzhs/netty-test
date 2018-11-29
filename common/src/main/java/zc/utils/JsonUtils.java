package zc.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class JsonUtils {
    //通用转换工具
    public static final ObjectMapper objectMapper = new ObjectMapper();

    //实体转Json数据
    public static String objectToJson(Object object) {
        String jsonStr = null;
        try {
            jsonStr = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    //实体转Json，key按增序排列
    public static String objectToJsonOrdered(Object object) {
        Map<String, Object> map = new TreeMap<String, Object>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        if (object != null) {
            Field[] declaredFileds = object.getClass().getDeclaredFields();
            for (Field field : declaredFileds) {
                field.setAccessible(true);
                try {
                    map.put(field.getName(), field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
        String jsonStr = null;
        try {
            jsonStr = objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    //实体转Json，key按降序排列
    public static String objectToJsonReverseOrdered(Object object) {
        Map<String, Object> map = new TreeMap<String, Object>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        if (object != null) {
            Field[] declaredFileds = object.getClass().getDeclaredFields();
            for (Field field : declaredFileds) {
                field.setAccessible(true);
                try {
                    map.put(field.getName(), field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
        String jsonStr = null;
        try {
            jsonStr = objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }
}
