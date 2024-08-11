package io.github.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cocat
 * @created 11-08-2024 - 08:32 PM
 * @package-name io.github.annotations
 * @project Advance-Java
 */

@Target( ElementType.METHOD )
@Retention( RetentionPolicy.RUNTIME )
public @interface CustomAnnotation {
	String name();
	int value();
}
