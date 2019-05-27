package com.example.hll_mall.testandroidsome;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectView {
    //id就表示哪些控件，-1就表示取不到时候的默认值
    int id() default -1;
}