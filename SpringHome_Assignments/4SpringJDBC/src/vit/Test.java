package vit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		DbGateway gate=(DbGateway)a.getBean("dbgateway");
		student st=(student)a.getBean("student");
		gate.insertStudent(st);
		System.out.println("Inserted...");
		gate.searchStudent(st);
		System.out.println("Searched..");
		gate.deleteStudent(st);
		System.out.println("Deleted...");
	}

}
