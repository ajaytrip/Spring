package com.ajay.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml"));
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		Shape obj = (Shape) context.getBean("triangle");
		obj.draw();
		
/*		ApplicationContext context= new ClassPathXmlApplicationContext("BeanDefinitionInheritance.xml");
		Triangle obj = (Triangle) context.getBean("triangle1");
		obj.draw();*/ 


	}

}
