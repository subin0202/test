package ex1_xml5_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		//스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml5_collections/applicationContext.xml");	
		
		MemberDao dao= context.getBean("daodao", MemberDao.class);
		dao.insert();
	}
}
