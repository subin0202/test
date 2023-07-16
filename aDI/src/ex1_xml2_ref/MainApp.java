package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
		MemberBean bean1 = context.getBean("member1",MemberBean.class);	
		bean1.output();
		
		MemberBean bean2 = context.getBean("member2",MemberBean.class);	
		bean2.output();
		
		MemberDao dao1 = context.getBean("dao1",MemberDao.class);	
		dao1.insert();
		
		MemberDao dao2 = context.getBean("dao2",MemberDao.class);	
		dao2.insert();
	}
}
