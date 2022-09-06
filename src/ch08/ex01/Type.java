package ch08.ex01;
								  //Annotation - �ôϾ ����� ���� ��
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)	//scope ���� ������ ��������ų� - SOURCE ���� / ����Ʈ�ڵ�󿡴� ����
@Target(ElementType.TYPE)	//Type ������ �� �� ����? 
public @interface Type {	//Annotation
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)	//���� ���� code-Retention , �⺻ Retention�� �� = Class
@Target(ElementType.FIELD)
@interface Field {
	int value();	//�⺻�� 
}

@Retention(RetentionPolicy.RUNTIME) //RUNTIME = ��ü���� Annotation�� ��
@Target(ElementType.CONSTRUCTOR)	//constructor = ������
@interface Constructor {
	int value() default 0; // ������ �����ϸ� �װ� ���� �Ⱦ��� �ʱⰪ 0
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