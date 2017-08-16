package com.cxc.refresh;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Refresh {
	
	/**
	 * cache key(maybe unique )
	 * @return
	 */
	public String key() default "";

}
