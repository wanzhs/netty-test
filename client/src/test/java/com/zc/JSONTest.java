package com.zc;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import zc.params.User;
import zc.utils.JsonUtils;
import zc.utils.MapUtils;

import javax.jws.soap.SOAPBinding;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JSONTest {
    public static void main(String[] args) throws Exception, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user=new User().setUsername("wanzhs").setPassword("admin123").setAge(23).setNickName("Cedar")
                .setSex("male").setTel("17698326540");
        ObjectMapper objectMapper=new ObjectMapper();

//        String username=BeanUtils.getSimpleProperty(user,"username");
//        System.out.println(username);
//        String jsonStr=objectMapper.writeValueAsString(user);


        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username","wanzhs");
        map.put("password","admin123");
        Object object=MapUtils.mapToObject(map,User.class);
        String string= JsonUtils.objectToJsonOrdered(user);
        System.out.println(string);
//        System.out.println(((User)object).toString());
    }
}
