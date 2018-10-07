package com.sekorm.binding;

import com.alibaba.fastjson.JSON;
import com.sekorm.annotations.JsonFieldName;
import com.sekorm.annotations.JsonListName;
import com.sekorm.annotations.JsonObjcetName;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * 标签处理器
 * 默认对象的成员变量所处的先后顺序进行排序
 * 默认没有注解的类将按字段名命名（集合类型中的形参的字段名亦不解析）
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 13:37
 */
public class JsonNameBinding {

    public static String getJson(Object object) throws Exception {
        return JSON.toJSONString(JsonNameBinding.convert(object));
    }

    private static LinkedHashMap<Object, Object> convert(Object object) throws IllegalAccessException {
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            JsonListName jsonListName = field.getAnnotation(JsonListName.class);
            JsonFieldName jsonFieldName = field.getAnnotation(JsonFieldName.class);
            JsonObjcetName jsonObjcetName = field.getAnnotation(JsonObjcetName.class);
            Class type = field.getType();
            field.setAccessible(true);
            Object value = field.get(object);
            if (value == null) {
                continue;
            }
            if (jsonListName != null) {
                List list = new ArrayList();
                List list1 = (List) value;
                for (Object o : list1) {
                    list.add(JsonNameBinding.convert(o));
                }
                linkedHashMap.put(jsonListName.name(), list);
            } else if (jsonFieldName != null) {
                linkedHashMap.put(jsonFieldName.name(), value);
            } else if (jsonObjcetName != null) {
                linkedHashMap.put(jsonObjcetName.name(), JsonNameBinding.convert(value));
            } else {
                linkedHashMap.put(field.getName(), value);
            }
        }
        return linkedHashMap;
    }

}
