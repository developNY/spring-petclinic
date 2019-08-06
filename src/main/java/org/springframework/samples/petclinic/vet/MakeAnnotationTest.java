package org.springframework.samples.petclinic.vet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//어디에서 해당 어노테이션을 사용할것인가?
@Target(ElementType.METHOD)
//해당 정보를 어느 시점까지 유지할 것인가?
@Retention(RetentionPolicy.RUNTIME)
public @interface MakeAnnotationTest {

}
