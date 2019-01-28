package com.psl.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value = ElementType.METHOD)	//what's the target of annotation = method 
@Retention(RetentionPolicy.RUNTIME) //to read reflectively
public @interface TestThis {
	public String name() default "<no-name>";       //attribute not a method
	
	
}
