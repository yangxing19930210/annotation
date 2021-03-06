package com.sekorm.annotations;

import java.lang.annotation.*;
/**
 * Object字段注解
 * @author noah_yang
 * @version 1.0
 * @create 2018-10-05 13:37
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonObjcetName {
    public String name();
}
