package com.buildingsmart.tech.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ FIELD, LOCAL_VARIABLE })
public @interface InverseProperty {

    public String InverseProp();
    public String Range();
}
