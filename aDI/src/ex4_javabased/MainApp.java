package ex4_javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//스프링 설정 파일 연결
	//	ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_pvalue/applicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberDao dao = context.getBean("memberDao", MemberDao.class);
		dao.insert();
		
	}
}
