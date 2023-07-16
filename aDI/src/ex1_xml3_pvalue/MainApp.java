package ex1_xml3_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_pvalue/applicationContext.xml");
		
		MemberDao dao = context.getBean("dao1", MemberDao.class);
		dao.insert();
		
	}
}
