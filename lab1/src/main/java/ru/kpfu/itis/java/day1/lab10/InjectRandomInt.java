package ru.kpfu.itis.java.day1.lab10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Dasha on 06.04.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface InjectRandomInt {
    int min() default 0;
    int max() default 1;
}
