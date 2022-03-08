package assignement13Spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignement13Spring.model.Student;
public class Main {
 
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student s =(Student) ac.getBean("student");
		System.out.println(s.toString());
		
}
	
}
