package ch08.ex01;
								  //Annotation - 시니어가 만든걸 내가 씀
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)	//scope 지정 어디까지 살아있을거냐 - SOURCE 까지 / 바이트코드상에는 없대
@Target(ElementType.TYPE)	//Type 위에다 쓸 수 있음? 
public @interface Type {	//Annotation
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)	//내가 쓰는 code-Retention , 기본 Retention의 값 = Class
@Target(ElementType.FIELD)
@interface Field {
	int value();	//기본값 
}

@Retention(RetentionPolicy.RUNTIME) //RUNTIME = 객체한테 Annotation을 줌
@Target(ElementType.CONSTRUCTOR)	//constructor = 생성자
@interface Constructor {
	int value() default 0; // 유저가 지정하면 그값 쓰고 안쓰면 초기값 0
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}