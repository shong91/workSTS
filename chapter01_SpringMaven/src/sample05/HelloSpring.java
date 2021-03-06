package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Score score = (Score) context.getBean("scoreImp");
	
		score.calc();
		score.display();
		
		((AbstractApplicationContext) context).close();
	}

}
