package org.springframework.samples.petclinic.vet;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//빈 등록
@Component

@Aspect
public class CreateAnnotatinTest {

	//어떤 어노테이션에 대해서 사용될지 지정한다
	@Around("@annotation(MakeAnnotationTest)")
	//ProceedingJoinPoint는 해당 어노테이션이 붙은 메소드 타겟들을 가리킨다.
	public Object test(ProceedingJoinPoint jp) throws Throwable {
		Object obj = jp.proceed();
		System.out.println("성공성공");
		
		return obj;
	}
}
